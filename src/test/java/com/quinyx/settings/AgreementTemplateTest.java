package com.quinyx.settings;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AgreementTemplateTest {
    AgreementTemplate agreementTemplate;
    @BeforeMethod
    public void setUp() {
        agreementTemplate = new AgreementTemplate();

    }

    @Test
    public void testCreateAgreement() {
       String expectedResult = "New Agreement";
       String actualResult = agreementTemplate.createAgreement();
       assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testUpdateAgreement() {
        String expectedResult = "Updated Agreement";
        String actualResult = agreementTemplate.UpdateAgreement();
        assertEquals(actualResult,expectedResult);
    }
}