package Service;

import Model.Product;
import Repository.IProductRepository;
import Repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
    iProductRepository.save(product);
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
