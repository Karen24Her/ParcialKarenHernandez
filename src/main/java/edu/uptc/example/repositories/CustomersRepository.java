package edu.uptc.example.repositories;

import edu.uptc.example.entities.customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<customers, Integer> {
}

