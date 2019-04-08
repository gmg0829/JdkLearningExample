package com.gmg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gmg
 * @title: PatternTest
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/8 13:06
 */
public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("\\d+");
        pattern.pattern();

        String[] str=pattern.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");

        Pattern.matches("\\d+","1233");

        // matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true
        Matcher matcher=pattern.matcher("23333");
        matcher.matches();

        //lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
        matcher.lookingAt();

        //find()对字符串进行匹配,匹配到的字符串可以在任何位置.
        matcher.find();





    }
}
