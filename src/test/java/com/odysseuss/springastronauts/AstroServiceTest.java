package com.odysseuss.springastronauts;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.odysseuss.springastronauts.records.AstroResult;
import com.odysseuss.springastronauts.services.AstroService;

@SpringBootTest
public class AstroServiceTest {

    @Test
    void getAstronauts(@Autowired AstroService service) {
        
        assertNotNull(service);

        AstroResult result = service.getAstronauts();
        assertNotNull(result);

        assertAll(
            () -> assertTrue(result.number() >= 0),
            () -> assertTrue(result.number() == result.people().size())
        );
    }
    
}
