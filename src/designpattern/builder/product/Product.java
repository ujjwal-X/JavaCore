package designpattern.builder.product;

import java.util.List;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private  String createdAt;
    private String updateAt;
    private List<String> images;

    public Product(String name, String desc, int price, String brand, String category, int discount, String createdAt, String updateAt, List<String> images) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.images = images;
    }

    Product(){

    }

    public Product(Builder b) {
        this.name=b.getName();
        this.brand=b.getBrand();
        this.desc=b.getDesc();
        this.createdAt=b.getCreatedAt();
        this.category=b.getCategory();
        this.price=b.getPrice();
        this.updateAt=b.getUpdateAt();
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public int getDiscount() {
        return discount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public List<String> getImages() {
        return images;
    }
}
