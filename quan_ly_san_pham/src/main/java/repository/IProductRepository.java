package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    Product findById(int id);

    void delete(Product product);

    List<Product> search(String name);
}
