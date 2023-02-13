package Model;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int priceProduct;
    private String describeProduct;
    private String producer;
    public Product() {
    }

    public Product(int idProduct, String nameProduct, int priceProduct, String describeProduct, String producer) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.describeProduct = describeProduct;
        this.producer = producer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", describeProduct='" + describeProduct + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
