package com.tcsemp.services.impl;

import com.tcsemp.services.ValidatorService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidatorServiceImplTest {

    @Test
    void validateEmail() {
        ValidatorService validatorService = new ValidatorServiceImpl();
        assertThat(validatorService.validateEmail("avinashkrupakar@icloud.com")).isTrue();
    }

    @Test
    void validatePhone() {
    }

    @Test
    void validateAddress() {
    }

    @Test
    void validateName() {
    }

    @Test
    void validateEmployee() {
    }
}