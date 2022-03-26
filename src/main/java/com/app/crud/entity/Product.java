package com.app.crud.entity;

import javax.persistence.*;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    
    private String name,description;
    private float price;
    
   
    public Product(){

    }
    
    public Product( String name, String description, float price) {
         super();
        this.name = name;
        this.description = description;
        this.price = price;
    }



    public int getId() {
        return Id;
    }



    public void setId(int id) {
        Id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public float getPrice() {
        return price;
    }



    public void setPrice(float price) {
        this.price = price;
    }

    
    
}
