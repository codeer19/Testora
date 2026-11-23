package com.testora.judge;
import com.testora.model.*; import java.util.*;
/** Complete outcome returned by the local judge. */
public record JudgeOutcome(String verdict,double score,long timeMs,List<TestResult> results,String detail) {}
