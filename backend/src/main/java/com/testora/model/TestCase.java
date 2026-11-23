package com.testora.model;
/** Input/output pair owned by a problem. */
public record TestCase(long id, long problemId, String input, String expectedOutput, boolean hidden) {}
