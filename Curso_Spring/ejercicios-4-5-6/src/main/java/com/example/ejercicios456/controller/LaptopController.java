package com.example.ejercicios456.controller;

import com.example.ejercicios456.entity.LaptopModel;
import com.example.ejercicios456.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation("Crear una laptop en DB")
    @PostMapping("/create")
    public LaptopModel createLaptop(@RequestBody LaptopModel laptop) {
        return laptopRepository.save(laptop);
    }
}
