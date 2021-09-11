package com.gmail.snyp4eg.dao;

import java.util.List;

public interface GenericDao<T> {
  T getById(Integer id);

  List<T> getAll();

  void insert(T t);

  void update(T t);

  void delete(T t);
}