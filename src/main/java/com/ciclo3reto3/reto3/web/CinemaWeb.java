/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo3reto3.reto3.web;

import com.ciclo3reto3.reto3.modelo.Cinema;
import com.ciclo3reto3.reto3.service.serviciosCinema;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Duvan
 */
@RestController
@RequestMapping("/api/cinema")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT} )
public class CinemaWeb {
    @GetMapping("/Hola mundo")
    public String saludar(){
        return "Hola duvan ";
    }
    @Autowired
    private serviciosCinema servicios;
    @GetMapping("/all")
    public List <Cinema> getcinema(){
        return servicios.getAll();
    }
    
   
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cinema save(@RequestBody Cinema cine){
        return servicios.save(cine);
    }
    
}
        
    
    

