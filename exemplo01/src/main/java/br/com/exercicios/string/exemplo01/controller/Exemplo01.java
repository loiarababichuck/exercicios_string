package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exemplo01service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exemplo01")
public class Exemplo01 {
    @Autowired
    Exemplo01service exemplo01service;

    @GetMapping
    public String getExemplo(){
        return "GET: Exemplo01";
    }

    @GetMapping("soma/{a}/{b}")
    public String soma(@PathVariable int a, @PathVariable int b){
        return "A soma dos valores informados é " + exemplo01service.soma(a,b);

    }

    @GetMapping("soma-query")
    public String somaQuery(@RequestParam int a, @RequestParam int b){
        return "A soma dos valores informados é "+ exemplo01service.soma(a, b);
    }
}
