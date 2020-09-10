package com.project.aji.repository;

import com.project.aji.model.Sekolah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SekolahRepository extends JpaRepository<Sekolah, Long> {
    Optional<Sekolah> findByNomorSekolah(Long nomorSekolah);
}