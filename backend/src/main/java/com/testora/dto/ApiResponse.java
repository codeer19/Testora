package com.testora.dto;
/** Generic service response which keeps UI code free of exceptions for expected failures. */
public record ApiResponse<T>(boolean success, String message, T data) { public static <T> ApiResponse<T> ok(String m,T d){return new ApiResponse<>(true,m,d);} public static <T> ApiResponse<T> fail(String m){return new ApiResponse<>(false,m,null);} }
