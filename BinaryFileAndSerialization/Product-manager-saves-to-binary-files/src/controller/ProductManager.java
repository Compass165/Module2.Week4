package controller;

import model.Product;
import view.ProductView;

public class ProductManager {
    private Product model;
    private ProductView view;

    public ProductManager(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }
    public int getId() {
        return model.getId();
    }
    public void setId(int id) {
        model.setId(id);
    }
    public String getName() {
        return model.getName();
    }
    public void setName(String name) {
        model.setName(name);
    }
    public String getManufacturer() {
        return model.getManufacturer();
    }
    public void setManufacturer(String manufacturer){
        model.setManufacturer(manufacturer);
    }
    public int getPrice() {
        return model.getPrice();
    }
    public void setPrice(int price) {
        model.setPrice(price);
    }
    public String getInformation() {
        return model.getInformation();
    }
    public void setInformation(String information) {
        model.setInformation(information);
    }
    public void updateProductView() {
        view.displayProductDetail(model.getId(), model.getName(), model.getManufacturer(),model.getPrice(), model.getInformation());
    }
}