package com.testora.model;
/** Persisted source-code attempt and its judgement. */
public record Submission(long id,long userId,long problemId,String sourceCode,String verdict,double score,long executionTimeMs,String submittedAt) {}
