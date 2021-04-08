package com.quinyx.schedule;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateScheduleTest {

    CreateSchedule createSchedule;

    @BeforeClass
    public void setUp() {
        createSchedule = new CreateSchedule();
    }

    @Test
    public void testCreateNewSchedule() {
        String expectedResult = "New Schedule";
        String actualResult = createSchedule.createNewSchedule();
        Assert.assertEquals(actualResult,expectedResult);
    }
}