package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// I Want to be able to search for a product and then change the quantity in stock to reflect current inventory levels.
// 1) I need to be able to prompt the user for which product to search for
// 2) I need to be able to show the products and allow the user to select a product to modify
// 3) I need to prompt the user to enter the new value quantity in stock
// 4) I need to set the new quantity in stock on the product and save it to the database

public class ProductMain {
    Scanner scanner = new Scanner(System.in);

    private ProductDAO productDAO = new ProductDAO();

    public void run(){
        String searchName = inputData();
        List<Product> products = productDAO.findByName(searchName);
        int productId =printListProductAndPromptFor(products);

        Product selected =productDAO.findById(productId);
        System.out.println(selected);

        int newQuantity = promptQuantityInStock();
        selected.setQuantityInStock(newQuantity);
        productDAO.update(selected);

    }

    public Integer promptQuantityInStock(){
        while(true) {
            try {
                System.out.println("Enter  new product quantity: ");
                Integer quantity = scanner.nextInt();
                return quantity;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid product quantity: ");
                scanner.nextLine();
            }
        }
    }

    public int printListProductAndPromptFor(List<Product> products){
        System.out.println("Product Name    |                 Quantity In stock");
        for(Product product : products){
            System.out.println(product.getId()+"    "+ product.getProductName()+"|         "+product.getQuantityInStock());

        }
        while(true) {
            try {
                System.out.println("Enter the id of the product to modify");
                int id = scanner.nextInt();
                return id;
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer");
                scanner.nextLine();
            }
        }
    }

    public String inputData(){
        System.out.println("Input the product the name you want to search");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        ProductMain pm = new ProductMain();
        pm.run();
    }
}
