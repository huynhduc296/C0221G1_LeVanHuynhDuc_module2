package bai_17.baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private String idProduct;
    private String nameProduct;
    private String theFirmProduct;
    private String priceProduct;

    public Product(String idProduct, String nameProduct, String theFirmProduct, String priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.theFirmProduct = theFirmProduct;
        this.priceProduct = priceProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getTheFirmProduct() {
        return theFirmProduct;
    }

    public void setTheFirmProduct(String theFirmProduct) {
        this.theFirmProduct = theFirmProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", theFirmProduct='" + theFirmProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
