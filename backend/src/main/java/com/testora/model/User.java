package com.testora.model;
/** Encapsulates an authenticated Testora account. */
public class User { private long id; private String name,email,passwordHash; private Role role;
 public User(){} public User(long id,String name,String email,String passwordHash,Role role){this.id=id;this.name=name;this.email=email;this.passwordHash=passwordHash;this.role=role;}
 public long getId(){return id;} public String getName(){return name;} public String getEmail(){return email;} public String getPasswordHash(){return passwordHash;} public Role getRole(){return role;}
 public void setId(long v){id=v;} public void setName(String v){name=v;} public void setEmail(String v){email=v;} public void setPasswordHash(String v){passwordHash=v;} public void setRole(Role v){role=v;} }
