package com.CloneNike.Shoes_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CloneNike.Shoes_API.Entity.KicksShoes;


public interface ShoesRepo  extends JpaRepository<KicksShoes, Integer>{

}
