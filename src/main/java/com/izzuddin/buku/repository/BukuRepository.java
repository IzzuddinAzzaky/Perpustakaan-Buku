/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.izzuddin.buku.repository;

import com.izzuddin.buku.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface BukuRepository extends JpaRepository<Buku, Long>{

    public Buku findByBukuId(Long bukuId);
    
}
