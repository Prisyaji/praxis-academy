package com.project.aji.repository;

import com.project.aji.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {
    // Optional<Barang> findById(Long id);
}