package com.example.CoffeShop.service;

import com.example.CoffeShop.entity.Pemesan;

import java.util.Date;
import java.util.List;

public interface PemesanService {

    Pemesan savePemesan(Pemesan pemesan);

    Pemesan getPemesanById(Long id);

    List<Pemesan> getAllPemesan();

    Pemesan updatePemesan(Long id, Pemesan pemesan);

    void deletePemesan(Long id);

}