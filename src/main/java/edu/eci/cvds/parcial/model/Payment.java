package edu.eci.cvds.parcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashMap;
import java.util.Date;

@Document(collection = "Payment")

public class Payment {
     @Id
    private String id;

    @Field("products")
    private HashMap<String, Integer> products;

    @Field("date")
    private Date date;

    @Field("totalPrice")
    private int totalPrice;

    public Payment(HashMap<String, Integer> products, Date date, int totalPrice) {
        this.products = products;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    public Date getDate() {
        return date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(HashMap<String, Integer> products) {
        this.products = products;
    }

    public void setDate(Date date) {
        this.date = date;
    } 

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}