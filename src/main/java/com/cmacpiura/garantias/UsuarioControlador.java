/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmacpiura.garantias;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MarioMario
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String obtener() {
        String saludo="hola";
        return saludo;
    }
    
}
