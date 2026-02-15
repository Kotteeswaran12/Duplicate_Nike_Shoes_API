package com.CloneNike.Shoes_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CloneNike.Shoes_API.Entity.NikeShoes;
import com.CloneNike.Shoes_API.Service.ShoesService;

@RestController
public class ShoeController {
	
	@Autowired
	private ShoesService service ;
	
	@PostMapping("/add")
	public NikeShoes addProduct(@RequestBody NikeShoes s) {
		return service.addProduct(s);
	}
	
	@GetMapping("/get")
	public List<NikeShoes> getAllShoes(){
		return service.getAllShoes();
	}
	
	@GetMapping("/get/{id}")
	public NikeShoes getById(@PathVariable Integer id) {
		return service.getById(id);
	}
}
