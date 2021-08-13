package com.example.babysitterapp.sample;

public class ThreadConcept {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int i = 0;
            while (true && !Thread.currentThread().isInterrupted()){
                i++;
                System.out.println("Output: " + i);
            }
        });
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}
