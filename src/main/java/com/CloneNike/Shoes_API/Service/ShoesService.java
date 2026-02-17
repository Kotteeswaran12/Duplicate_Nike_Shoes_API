package com.CloneNike.Shoes_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CloneNike.Shoes_API.Entity.KicksShoes;

import com.CloneNike.Shoes_API.Entity.ShoesImages;
import com.CloneNike.Shoes_API.Repository.ShoesRepo;

@Service
public class ShoesService {
	
	@Autowired
	private  ShoesRepo repo;
	
	
	public KicksShoes addProduct(KicksShoes s) {
		
		
		return repo.save(s);
	}
	
	
	public List<KicksShoes> getAllShoes(){
		return repo.findAll();
	}
	
	public KicksShoes getById(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
