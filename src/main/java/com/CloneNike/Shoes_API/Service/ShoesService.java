package com.CloneNike.Shoes_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CloneNike.Shoes_API.Entity.NikeShoes;
import com.CloneNike.Shoes_API.Entity.ShoesImages;
import com.CloneNike.Shoes_API.Repository.ShoesRepo;

@Service
public class ShoesService {
	
	@Autowired
	private  ShoesRepo repo;
	
	
	public NikeShoes addProduct(NikeShoes s) {
		
		List<ShoesImages> img = s.getImg();
			
		for(ShoesImages sm : img) {
			sm.setNikeShoes(s);
		}
		
		return repo.save(s);
	}
	
	
	public List<NikeShoes> getAllShoes(){
		return repo.findAll();
	}
	
	public NikeShoes getById(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
