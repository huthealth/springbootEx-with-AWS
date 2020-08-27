package com.huttels.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.*;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //assertEquals(name,dto.getName());
        //assertEquals(amount,dto.getAmount());
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}