package com.testora.config;
import java.io.*; import java.sql.*; import java.util.*;
/** Creates JDBC connections using local, uncommitted configuration. */
public final class DBConnection { private static final Properties P=new Properties(); static { try(InputStream in=new FileInputStream("db.properties")){P.load(in);}catch(IOException e){System.err.println("db.properties not found; database features need configuration.");} }
 private DBConnection(){} public static Connection getConnection() throws SQLException { // SYLLABUS: JDBC DriverManager
   return DriverManager.getConnection(P.getProperty("db.url"),P.getProperty("db.user"),P.getProperty("db.password")); }
 public static boolean healthCheck(){ // SYLLABUS: JDBC Statement
   try(Connection c=getConnection(); Statement s=c.createStatement(); ResultSet r=s.executeQuery("SELECT 1")){return r.next();}catch(SQLException e){return false;} }
}
