package com.oop_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductReader {
    public List<Product> readProducts() {
        List<Product> products = new ArrayList<>();
        File input  = new File("products.csv");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String header = null;
        try {
            header = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String product = null;
        try {
            product = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(header);
        System.out.println(product);
        while (product != null) {

            Product p = parseProduct(product);
            try {
                product= bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(p);
            products.add(p);
        }
        System.out.println(products);

        return products;
    }

    private Product parseProduct(String line) {
        String[] parts = line.split(",");
        Product product = new Product();
        product.setName(parts[0]);
        product.setPrice(Double.parseDouble(parts[1]));
        product.setQuantityAvailable(Integer.parseInt(parts[2]));
        product.setBeverage(Boolean.parseBoolean(parts[3]));
        return product;

    }


}
