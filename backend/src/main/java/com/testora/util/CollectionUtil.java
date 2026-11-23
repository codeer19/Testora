package com.testora.util;
import java.util.*;
/** Small generic collection examples used by services. */
public final class CollectionUtil { private CollectionUtil(){} public static <T extends Comparable<T>> T maximum(Collection<T> values){return values.stream().max(Comparable::compareTo).orElseThrow();} // SYLLABUS: bounded generic
}
