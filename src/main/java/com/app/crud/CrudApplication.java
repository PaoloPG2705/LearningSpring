package com.app.crud;

import com.app.crud.Repository.ProductRepository;
import com.app.crud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository pr;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		Product p1 = new Product("Queque", "Naranja,Platano,Vainilla,Marmoleado", 2);
		Product p2 = new Product("Bombones","Chocolate", 4);
		Product p3 = new Product("Turron","Maizena con Miel", 7);
		pr.save(p1);
		pr.save(p2);
		pr.save(p3);
	}

}
