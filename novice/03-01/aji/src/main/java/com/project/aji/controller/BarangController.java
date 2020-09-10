package com.project.aji.controller;

import com.project.aji.model.Barang;
import com.project.aji.repository.BarangRepository;
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
@RequestMapping("/barang")
public class BarangController {
  
  @Autowired
  public BarangRepository barangRepository;

    @GetMapping("/all")
    public @ResponseBody List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    @GetMapping("/barang/{id}")
    public @ResponseBody Barang getById(@PathVariable Long id){
        return barangRepository.findById(id).get();
    }

    @PostMapping("/post") 
    public @ResponseBody Barang addNewBarang(@RequestBody Barang barang){
        return barangRepository.save(barang);
    }

    @PutMapping("/ganti/{id}")
    public Barang update(@PathVariable Long id, @RequestBody Barang newBarang) {
      Barang barang = barangRepository.findById(id).get();
      barang.setNama(newBarang.getNama());
      barang.setHarga(newBarang.getHarga());
      barang.setSku(newBarang.getSku());
      barang.setMerk(newBarang.getMerk());
      
    return barangRepository.save(barang);
    }
    
    @DeleteMapping("/hapus/{id}")
    public String deleteBarang(@PathVariable Long id) {
      Barang barang = barangRepository.findById(id).get();
      barangRepository.delete(barang);
      return "Masyarakat";
    }

  }

  // https://www.petanikode.com/java-perulangan/


  //barang, id(key), nama(string),harga(long), SKU(string),merk(string)