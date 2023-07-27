package com.poc.design.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class SingletonTest {


    @Test
    public void shouldNotCreateMoreThanOneInstance(){
        var instanceV1 = SingletonConfigurationApi.getInstance();
        var instanceV2 = SingletonConfigurationApi.getInstance();

        assert instanceV1 == instanceV2;
    }

}
