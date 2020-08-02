package com.poc.admin;

import java.util.Objects;



public class Product {
	/*
	 * this class of module admin is basically used to set and return paramaters to cart class.
	 * with the help of getter setter method.
	 */
	private Integer pid;
    private String name;
    private Double price;
    private Integer stock;
    
    public Product () {       
    }
    
    public Product (Integer pid, String name, Double price, Integer stock) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //@return the name
     
    public String getName() {
        return name;
    }

   // @param name the name to set
    
    public void setName(String name) {
        this.name = name;
    }

    //return the price
     
    public Double getPrice() {
        return price;
    }

    
     //set the price
     
    public void setPrice(Double price) {
        this.price = price;
    }

    //return the stock
 
    public Integer getStock() {
        return stock;
    }

    // set the stock
     
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    // return the pid
    
    public Integer getPid() {
        return pid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pid);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        return true;
    }

    //used to set pid
     
    public void setPid(Integer pid) {
        this.pid = pid;
    }   

}
