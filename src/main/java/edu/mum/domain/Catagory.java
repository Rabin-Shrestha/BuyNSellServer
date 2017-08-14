package edu.mum.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by yentran
 */
@Document
public class Catagory {
//    List<Product> products;
//    List<WishList> wishLists;
    @Id
    private String id;
    private String name;


    public Catagory() {}

//    public List<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
//
//    public List<WishList> getWishLists() {
//        return wishLists;
//    }
//
//    public void setWishLists(List<WishList> wishLists) {
//        this.wishLists = wishLists;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Catagory {id='" + id + '\'' + ", name='" + name + '\'' + '}';
	}
    
    
}
