package com.example.CoffeShop.service;

import com.example.CoffeShop.entity.Pemesan;
import com.example.CoffeShop.repository.PemesanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PemesanServiceImpl implements PemesanService {

    @Autowired
    private PemesanRepository pemesanRepository;

    @Override
    public List<Pemesan> getAllPemesan() {
        return pemesanRepository.findAll();
    }

    @Override
    public Pemesan getPemesanById(Long id) {
        return pemesanRepository.findById(id).orElse(null);
    }

    @Override
    public Pemesan savePemesan(Pemesan pemesan) {
        return pemesanRepository.save(pemesan);
    }

    @Override
    public Pemesan updatePemesan(Long id, Pemesan pemesan) {
        pemesan.setId(id);
        return pemesanRepository.save(pemesan);
    }

    @Override
    public void deletePemesan(Long id) {
        pemesanRepository.deleteById(id);
    }
}
