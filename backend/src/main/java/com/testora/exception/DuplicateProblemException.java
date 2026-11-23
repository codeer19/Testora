package com.testora.exception;
/** Signals a duplicate title/slug in problem maintenance. */
public class DuplicateProblemException extends Exception { public DuplicateProblemException(String m){super(m);} }
