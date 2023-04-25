package com.example.ejercicios456.controller;

import com.example.ejercicios456.entity.LaptopModel;
import com.example.ejercicios456.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laptops/")
public class LaptopController {
    @Autowired
    private LaptopRepository laptopRepository;

    @ApiOperation("Obtener todas las laptops registradas")
    @GetMapping("all")
    public List<LaptopModel> getLaptops() {
        return laptopRepository.findAll();
    }

    @ApiOperation("Traer laptop por id, no hay manejo de excepciones por el momento")
    @GetMapping("find/{id}")
    public Optional<LaptopModel> findLaptopById(@PathVariable Long id){
        return laptopRepository.findById(id);
    }

    @ApiOperation("Crear una laptop en DB")
    @PostMapping("/create")
    public ResponseEntity<LaptopModel> createLaptop(@RequestBody LaptopModel laptop) {
        if(laptop.getId() != null) {
            return ResponseEntity.ok(laptopRepository.save(laptop));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/update")
    public ResponseEntity<LaptopModel> updateLaptop(@RequestBody LaptopModel laptop) {
        if(laptop.getId() != null) {
            return ResponseEntity.ok(laptopRepository.save(laptop));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteLaptop(@PathVariable Long id){
        try{
            laptopRepository.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);
        return ResponseEntity.ok("Elemento eliminado");
    }
}
