package com.gmg.concurrent;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Benjamin Winterberg
 */
public class CompletableFuture2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "tony");

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "cafei");

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "aaron");

        CompletableFuture<Void> allFutures=CompletableFuture.allOf(future1, future2, future3);

        CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
            return Stream.of(future1, future2, future3)
                    .map(pageContentFuture -> pageContentFuture.join())
                    .collect(Collectors.toList());
        });

    }

}
