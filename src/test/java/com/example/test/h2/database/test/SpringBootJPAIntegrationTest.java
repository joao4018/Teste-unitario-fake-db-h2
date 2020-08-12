package com.example.test.h2.database.test;

import com.example.test.h2.database.test.model.Generically;
import com.example.test.h2.database.test.repository.GenericEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Sql({"/schema.sql", "/data.sql"})
public class SpringBootJPAIntegrationTest {

    @Autowired
    private GenericEntityRepository genericEntityRepository;


    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
//        GenericEntity genericEntity = genericEntityRepository
//                .save(new GenericEntity("test"));

        List<Generically> foundEntity = genericEntityRepository.findAll();

        assertNotNull(foundEntity);
        assertEquals(foundEntity.get(0).getValue(), "test");
    }
}