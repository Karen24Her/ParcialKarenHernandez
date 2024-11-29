package edu.uptc.example.repositories;

import edu.uptc.example.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer> {
}