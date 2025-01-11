package oneplusone;

public class Product {
    private int prodId;
    private Brand brand;
    private String name;
    private String event;
    private int price;

    public Product(int prodId, Brand brand, String name, String event, int price) {
        this.prodId = prodId;
        this.brand = brand;
        this.name = name;
        this.event = event;
        this.price = price;
    }

    public int getProdId() {return prodId;}
    public void setProdId(int prodId) {this.prodId = prodId;}
    public Brand getBrand() {return brand;}
    public void setBrand(Brand brand) {this.brand = brand;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEvent() {return event;}
    public void setEvent(String event) {this.event = event;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", brand=" + brand.getBrandName() + ", name=" + name + ", event=" + event + ", price=" + price + "]";
    }

}