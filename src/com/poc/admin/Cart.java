package com.poc.admin;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cart {
	/*
	 * this class cart is of module admin is used to  store saved products in list interface  and get those product gave total of added product to costumer.  .
	 * all method s from this calss r call in UI.java class .
	 */
	Scanner scc=new Scanner(System.in);
	 List<Product> cartItems = new ArrayList<Product>();
	    //function to add product to cart by id  
	    public void addProductToCartByPID(int pid) {
	        Product product = getProductByProductID(pid);
	        addToCart(product);
	    }
	    //function  to add product to cart by id 
	    private Product getProductByProductID(int pid) {
	        Product product = null;
	        List<Product> products = new Products().getProducts();
	        for (Product prod: products) {
	            if (prod.getPid() == pid) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }
	    //function  to add product to cart by id 
	    private void addToCart(Product product) {
	        cartItems.add(product);
	    }
	    //function  to remove  product from cart by id 
	    public void removeProductByPID(int pid) {
	        Product prod = getProductByProductID(pid);
	        cartItems.remove(prod);
	    }
	    
	    int total=0;//initialise total value with zero
	    
	    //function to print cart items and price
	    public void printCartItems() {
	        for (Product prod: cartItems) {
	        	
	            System.out.println(prod.getName());
	            System.out.println("------------------------------------------------------");
	            System.out.println("buy it for only Rs"+prod.getPrice());
	            total=(int) (total+prod.getPrice());
	            System.out.println("would you like to checkout these products enter Y/N");
	            String c=scc.nextLine();
	            if(c.equalsIgnoreCase("y"))
	            {
	            System.out.println("you have to pay only Rs  = "+total);
	            }
	            System.out.println("thankyou for shopping ");
	            System.out.println("visit again ");
	            System.out.println("--------------------------------------------------");
	            
	        }
	    }
}
