package com.odysseuss.springastronauts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.odysseuss.springastronauts.services.AstroService;

@SpringBootTest
public class AstroServiceTest {

    @Test
    void getAstronauts(@Autowired AstroService service) {
        assertNotNull(service);
    }
    
}
