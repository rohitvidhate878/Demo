package com.week2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

class ThreadCount implements Runnable {
	static Logger logger=Logger.getLogger(ThreadCount.class.getName());
    private static int counter = 0;
    private static final int LIMIT= 1000000;
    private static final int POOLSIZE = 10;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(POOLSIZE);
        for (int i = 0; i < POOLSIZE; i++) {
            executorService.submit(new ThreadCount());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (counter <= LIMIT) {
            increaseCounter();
        }
    }

    private static void increaseCounter() {
        logger.debug(Thread.currentThread().getName() + " : " + counter);
        counter++;
    }
}