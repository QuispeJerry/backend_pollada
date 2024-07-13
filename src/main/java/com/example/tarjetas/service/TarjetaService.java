package com.example.tarjetas.service;

import com.example.tarjetas.domain.Tarjeta;
import com.example.tarjetas.domain.TarjetaRepository;
import com.example.tarjetas.shared.domain.persistence.BaseRepository;
import com.example.tarjetas.shared.service.crudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaService extends crudImpl<Tarjeta, Long> {
    @Autowired
    private TarjetaRepository aRepository;

    public TarjetaService(BaseRepository<Tarjeta, Long> baseRepository){
        super(baseRepository);
    }
}