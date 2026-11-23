package com.testora.dao;
import com.testora.config.DBConnection; import com.testora.model.*; import java.sql.*; import java.util.*;
/** CRUD access for user accounts. */
public class UserDAO implements CrudDAO<User,Long>{
 private User map(ResultSet r)throws SQLException{return new User(r.getLong("id"),r.getString("name"),r.getString("email"),r.getString("password_hash"),Role.valueOf(r.getString("role")));}
 public User create(User u)throws SQLException{String q="INSERT INTO users(name,email,password_hash,role) VALUES(?,?,?,?)";try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement(q,Statement.RETURN_GENERATED_KEYS)){p.setString(1,u.getName());p.setString(2,u.getEmail());p.setString(3,u.getPasswordHash());p.setString(4,u.getRole().name());p.executeUpdate();try(ResultSet k=p.getGeneratedKeys()){if(k.next())u.setId(k.getLong(1));}return u;}}
 public Optional<User> findById(Long id)throws SQLException{return find("SELECT * FROM users WHERE id=?",id);}
 public Optional<User> findByEmail(String email)throws SQLException{return find("SELECT * FROM users WHERE email=?",email);}
 private Optional<User> find(String q,Object value)throws SQLException{try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement(q)){p.setObject(1,value);try(ResultSet r=p.executeQuery()){return r.next()?Optional.of(map(r)):Optional.empty();}}}
 public List<User> findAll()throws SQLException{List<User>a=new ArrayList<>();try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("SELECT * FROM users ORDER BY name");ResultSet r=p.executeQuery()){while(r.next())a.add(map(r));}return a;}
 public boolean update(User u)throws SQLException{try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("UPDATE users SET name=?,email=?,role=? WHERE id=?")){p.setString(1,u.getName());p.setString(2,u.getEmail());p.setString(3,u.getRole().name());p.setLong(4,u.getId());return p.executeUpdate()>0;}}
 public boolean delete(Long id)throws SQLException{try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement("DELETE FROM users WHERE id=?")){p.setLong(1,id);return p.executeUpdate()>0;}}
}
