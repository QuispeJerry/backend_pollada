package com.example.tarjetas.shared.service;


import com.example.tarjetas.shared.domain.persistence.BaseRepository;
import com.example.tarjetas.shared.domain.service.crud;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class crudImpl<T, ID extends Serializable> implements crud<T, ID> {

    protected BaseRepository<T, ID> baseRepository;

    public crudImpl(BaseRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional(readOnly = true)
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<T> getById(ID id) throws Exception {
        try {
            return baseRepository.findById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    public T update(T entity, ID id) {
        return baseRepository.save(entity);
    }

    @Transactional
    public boolean deleteById(ID id) {
        if (baseRepository.existsById(id)) {
            baseRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
