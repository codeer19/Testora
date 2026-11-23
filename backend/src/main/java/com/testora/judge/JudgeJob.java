package com.testora.judge;
import com.testora.model.*; import java.util.*; import java.util.concurrent.*;
/** Priority queue unit for a submission waiting to be judged. */
public class JudgeJob implements Comparable<JudgeJob>{public final long userId; public final Problem problem; public final String source; public final List<TestCase> tests; public final CompletableFuture<JudgeOutcome> future=new CompletableFuture<>(); public JudgeJob(long userId,Problem p,String source,List<TestCase> tests){this.userId=userId;problem=p;this.source=source;this.tests=tests;} public int compareTo(JudgeJob o){return Integer.compare(problem.getTimeLimitSec(),o.problem.getTimeLimitSec());}}
