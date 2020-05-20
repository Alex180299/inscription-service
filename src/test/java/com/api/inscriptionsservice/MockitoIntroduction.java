package com.api.inscriptionsservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class MockitoIntroduction {

    @Mock
    Map<String, Object> mapMock;

    @BeforeEach
    void setUp(){
        //MockitoAnnotations.initMocks(this); --> Extends the class
    }

    @Test
    void testMock(){
        mapMock.put("Key", "Value");
    }

}
