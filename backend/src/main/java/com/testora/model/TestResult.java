package com.testora.model;
/** Result of one testcase execution. */
public record TestResult(long testcaseId,String verdict,long executionTimeMs) {}
