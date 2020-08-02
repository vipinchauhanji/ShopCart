package com.poc.admin;

import java.util.ArrayList;
import java.util.List;

/* this class is of admin module which is used to set products, thier price ,product id and  number of items in stock 
 * 
 */


public class Products {
	/*
	 * i 've used list collection framework to store prodct detail
	 */
	private final List<Product> products = new ArrayList<Product>();
//constructor used to call initstoreitems method.
    public Products () {
        this.initStoreItems();
    }
    //used to return all products details to return type list<product> of product class.
    public List<Product> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
    	//array is used to store details of product 
        String [] productNames = {"Lux Soap", "Fair n Lovely", "amul milk","garneir facewash","marlbouro advance"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d,95.00d,18.00d};
        Integer [] stock = {10, 6, 10,7,5};
        //this loop  is used for adding product ,price,and product id return to list object.
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }

}
