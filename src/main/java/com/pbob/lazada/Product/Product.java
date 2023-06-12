package com.pbob.lazada.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Product
 */


 //agar tidka usah buat setter getter
 @Data
 
 //menyatakan bahwa kelas ini merupakan kelas Entitas
 //akan direlasikan dengan tabel pada database
 @Entity
public class Product {

    //mmenentukan atribut mana yang digunakan sebagai ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nama;
    private String deskripsi;
    private double harga;
    private String stok;

    public Product() {
    }

    public Product(Long id, String nama, String deskripsi, double harga, String stok) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }
    


}