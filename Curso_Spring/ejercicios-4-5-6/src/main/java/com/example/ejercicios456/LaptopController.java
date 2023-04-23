package com.example.ejercicios456;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public LaptopModel createLaptop(@RequestBody LaptopModel laptop) {
        return laptopRepository.save(laptop);
    }
}
