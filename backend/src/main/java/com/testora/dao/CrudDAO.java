package com.testora.dao;
import java.util.*;
/** Generic contract shared by database repositories. */
public interface CrudDAO<T,ID>{ T create(T value) throws Exception; Optional<T> findById(ID id) throws Exception; List<T> findAll() throws Exception; boolean update(T value) throws Exception; boolean delete(ID id) throws Exception; }
