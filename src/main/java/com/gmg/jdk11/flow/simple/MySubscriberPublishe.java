package com.gmg.jdk11.flow.simple;

import java.util.Arrays;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * @author gmg
 * @title: MySubscriber
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/7/7 14:57
 *
 * http://chillyc.info/2017/jdk9/Java9-Flow-feature/?nsukey=57L9LOAx96I4AhgzDI4wxz5C2Fh6l5ecjHk9JaZChNvrgB4sGdhya9OoJ618%2B7rtdo2YXq07xtwJQA9h803AoJeRRYLhvhBWKM2Wcbf%2BI3ifFCIXZEfyakUTuI33AUso39aR%2F5FRKTf2kT1qC0TWeo2BoM26kEGnPPcLnzB55JlqiXPkUpzURsJBuQrSpQH3cwjG%2BggU8%2B7Y68BLRrIG7Q%3D%3D
 */
public  class MySubscriberPublishe {

    public static class MySubscriber<T> implements Flow.Subscriber<T> {
        private Flow.Subscription subscription;
        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1); //这里要使用Long.MAX_VALUE就会被认为获取无穷的数据。
        }
        @Override
        public void onNext(T item) {
            System.out.println("Got : " + item);
            subscription.request(1); //这里也可以使用Long.MAX_VALUE
        }
        @Override
        public void onError(Throwable t) {
            t.printStackTrace();
        }
        @Override
        public void onComplete() {
            System.out.println("Done");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        //Register Subscriber
        MySubscriber<String> subscriber = new MySubscriber<>();
        publisher.subscribe(subscriber);
        //Publish items
        System.out.println("Publishing Items...");
        String[] items = {"1", "x", "2", "x", "3", "x"};
        Arrays.asList(items).stream().forEach(i -> publisher.submit(i));
        publisher.close();
        Thread.sleep(20000);
    }
}
