package edu.uptc.example.repositories;

import edu.uptc.example.entities.product;
import edu.uptc.example.entities.sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<sale, Integer> {

    List<product> findProductsById(Integer saleId);
}