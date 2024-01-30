package com.example.CoffeShop.controller;

import com.example.CoffeShop.entity.Pemesan;
import com.example.CoffeShop.service.PemesanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/pemesans")
public class PemesanController {

    @Autowired
    private PemesanService pemesanService;

    @PostMapping
    public Pemesan savePemesan(@RequestBody Pemesan pemesan) {
        return pemesanService.savePemesan(pemesan);
    }
    @GetMapping
    public List<Pemesan> getAllPemesan() {
        return pemesanService.getAllPemesan();
    }

    @GetMapping("/{id}")
    public Pemesan getPemesanById(@PathVariable Long id) {
        return pemesanService.getPemesanById(id);
    }

    @PutMapping("/{id}")
    public Pemesan updatePemesan(@PathVariable Long id, @RequestBody Pemesan pemesan) {
        return pemesanService.updatePemesan(id, pemesan);
    }

    @DeleteMapping("/{id}")
    public void deletePemesan(@PathVariable Long id) {
        pemesanService.deletePemesan(id);
    }
}
