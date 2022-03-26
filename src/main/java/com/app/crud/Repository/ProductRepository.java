package com.app.crud.Repository;

import com.app.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
