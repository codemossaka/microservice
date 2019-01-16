package app.test.monapp.dao;

import app.test.monapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}
