package com.example.tarjetas.domain;

import com.example.tarjetas.shared.domain.persistence.BaseRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends BaseRepository<Tarjeta, Long> {
}
