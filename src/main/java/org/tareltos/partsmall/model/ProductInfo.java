package org.tareltos.partsmall.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tareltos.partsmall.entity.Product;

public class ProductInfo {
    private String code;
    private String name;
    private String group;
    private String brand;
    private double price;
 
    private boolean newProduct=false;
 
    // Upload file.
    private CommonsMultipartFile fileData;
 
    public ProductInfo() {
    }
 
    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.group = product.getGroup();
        this.brand = product.getBrand();
    }
 
    
    public ProductInfo(String code, String name, String brand, String group, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.group = group;
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
    
     
    public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public CommonsMultipartFile getFileData() {
        return fileData;
    }
 
    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }
 
    public boolean isNewProduct() {
        return newProduct;
    }
 
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
 
}
