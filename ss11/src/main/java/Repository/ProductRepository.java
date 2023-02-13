package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"thuốc tránh thai",50000,"tránh thai","Nanofrance"));
        productList.add(new Product(2,"que thử thai",25000,"thử thai","Nanofrance"));
        productList.add(new Product(3,"thuốc cảm",500000,"trị cảm" , "Nanofrance"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
    productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
