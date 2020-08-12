package com.example.test.h2.database.test.repository;

import com.example.test.h2.database.test.model.Generically;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericEntityRepository
        extends JpaRepository<Generically, Long> {
}
