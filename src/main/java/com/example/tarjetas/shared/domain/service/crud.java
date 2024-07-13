package com.example.tarjetas.shared.domain.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
public interface crud<T, ID extends Serializable> {
    List<T> getAll();
    Optional<T> getById(ID id) throws Exception;
    T save(T entity);
    T update(T entity, ID id);
    boolean deleteById(ID id);
}