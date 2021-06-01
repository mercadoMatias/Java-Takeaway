package products.drinks;

import java.util.Objects;

public abstract class Drink {
    private String brand;
    private int stock;
    private float price;
    private float size;
    private String bottling;
    private boolean fizz;
    private String flavor;


    //region GET/SET

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getBottling() {
        return bottling;
    }

    public void setBottling(String bottling) {
        this.bottling = bottling;
    }

    public boolean isFizz() {
        return fizz;
    }

    public void setFizz(boolean fizz) {
        this.fizz = fizz;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Float.compare(drink.size, size) == 0 && Objects.equals(brand, drink.brand) && Objects.equals(bottling, drink.bottling) && Objects.equals(flavor, drink.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size, bottling, flavor);
    }
}