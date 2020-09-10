package com.project.aji.controller;

import com.project.aji.model.Sekolah;
import com.project.aji.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import java.util.Optional;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/sekolah")
public class SekolahController {
  
  @Autowired
  public SekolahRepository sekolahRepository;

    @GetMapping("/all")
    public @ResponseBody List<Sekolah> getAllSekolah() {
        return sekolahRepository.findAll();
    }

    @GetMapping("/sekolah/{id}")
    public @ResponseBody Sekolah getByNomorSekolah(@PathVariable("id")Long nomorSekolah){
        return sekolahRepository.findByNomorSekolah(nomorSekolah).get();
    }

    @PostMapping("/post") 
    public @ResponseBody Sekolah addNewSekolah(@RequestBody Sekolah sekolah){
        return sekolahRepository.save(sekolah);
    }

    @PutMapping("/ganti/{id}")
    public Sekolah update(@PathVariable("id") Long nomorSekolah, @RequestBody Sekolah newSekolah) {
      Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomorSekolah).get();
      sekolah.setNamaSekolah(newSekolah.getNamaSekolah());
    return sekolahRepository.save(sekolah);
    }
    

    @DeleteMapping("/hapus/{id}")
    public String deleteSekolah(@PathVariable("id") Long nomorSekolah) {
      Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomorSekolah).get();
      sekolahRepository.delete(sekolah);
      return "mantap";
    }

  }

  // https://www.petanikode.com/java-perulangan/


  //barang, id(key), nama(string),harga(long), SKU(string),merk(string)