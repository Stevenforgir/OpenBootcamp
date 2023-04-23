package com.example.ejercicios456;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laptops/")
public class LaptopController {
    @Autowired
    private LaptopRepository laptopRepository;

    @GetMapping("all")
    public List<LaptopModel> getLaptops() {
        return laptopRepository.findAll();
    }
}
