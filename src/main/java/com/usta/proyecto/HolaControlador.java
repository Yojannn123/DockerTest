package com.usta.proyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaControlador {

    @GetMapping("/")
    public String saludo() {
        return "Hola mundo 🌿";
    }
}
