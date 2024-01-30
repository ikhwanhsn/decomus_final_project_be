package com.example.CoffeShop.repository;

import com.example.CoffeShop.entity.Pemesan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PemesanRepository extends JpaRepository<Pemesan, Long> {
}
