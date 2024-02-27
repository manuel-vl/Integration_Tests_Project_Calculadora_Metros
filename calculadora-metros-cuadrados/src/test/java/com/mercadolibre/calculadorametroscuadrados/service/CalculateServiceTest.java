package com.mercadolibre.calculadorametroscuadrados.service;

import com.mercadolibre.calculadorametroscuadrados.dto.HouseDTO;
import com.mercadolibre.calculadorametroscuadrados.dto.HouseResponseDTO;
import com.mercadolibre.calculadorametroscuadrados.utils.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {
    CalculateService service;

    @BeforeEach
    public void setUp(){
        service=new CalculateService();
    }

    @Test
    void calculatePriceOK(){
        // Arrange
        HouseDTO house= TestUtils.getHouseDTO();

        // Act
        HouseResponseDTO houseResult=service.calculate(house);

        // Assert
        Assertions.assertEquals(10400, houseResult.getPrice());
    }


}