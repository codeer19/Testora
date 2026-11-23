package com.testora.judge;
/** Runnable consumer that executes queue jobs. */
public class JudgeWorker implements Runnable {private final JudgeQueue queue; private volatile boolean running=true; JudgeWorker(JudgeQueue q){queue=q;} public void stop(){running=false;} public void run(){while(running){try{JudgeJob j=queue.take();j.future.complete(new JavaCompilerRunner().judge(j.source,j.problem,j.tests));}catch(InterruptedException e){Thread.currentThread().interrupt();return;}}}}
