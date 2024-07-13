package com.example.tarjetas.controller;

import com.example.tarjetas.domain.Tarjeta;
import com.example.tarjetas.service.TarjetaService;
import com.example.tarjetas.shared.api.BaseControllerImpl;
import com.example.tarjetas.shared.domain.api.BaseController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "tarjetas")
public class TarjetaController  extends BaseControllerImpl<Tarjeta, TarjetaService> {
}
