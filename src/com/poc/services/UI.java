package com.poc.services;

import java.util.List;
import java.util.Scanner;

import com.poc.admin.*;

public class UI {
	/*
	 * This services  module is used to provide costumer functionality like "add to cart" "go to cart","remove from cart" , "display product" ,and "buy product"
	 * And also product show product details ,price and items quantity left.
	 * It contains one class UI.java (userSpecification).
	 * all method used in this aclass are belongs to admin module.
	 */
	Cart cart = new Cart();
    private int ch = 0;
    //constructor used to call menu method
    public UI () {
        menu();
    }
    
    public void startScreen () {
    	System.out.println("------------------------------------");
    	System.out.println();
        System.out.println("1. show  smart Products");
        System.out.println("2. go to Cart");
        System.out.println("0. logout");
        System.out.println("------------------------------------");
    }
    
    public void storeProductsMenu() {
    	System.out.println("------------------------------------");
        System.out.println("1. Add to product Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. log out");
        System.out.println("------------------------------------");
    }
    
    public void menu () {//it is basically user specification
        do {
            startScreen();
            getUserInput();
            
            switch (ch) {
                case 1: 
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    
                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                
                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        @SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);      
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}
