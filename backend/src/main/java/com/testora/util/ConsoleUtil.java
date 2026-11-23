package com.testora.util;
import java.util.*;
/** Safe console input and simple table output helpers. */
public final class ConsoleUtil { private ConsoleUtil(){} public static String read(Scanner s,String prompt){System.out.print(prompt);return s.nextLine().trim();} public static int readInt(Scanner s,String p){while(true){try{return Integer.parseInt(read(s,p));}catch(NumberFormatException e){System.out.println("Enter a number.");}}} public static void line(){System.out.println("------------------------------------------------------------");} }
