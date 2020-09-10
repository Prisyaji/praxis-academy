package com.project.aji.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="barang")
public class Barang {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nama;

    private String harga;

    private String sku;

    private String merk;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
}