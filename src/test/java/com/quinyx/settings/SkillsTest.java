package com.quinyx.settings;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SkillsTest {

    Skills skills;

    @BeforeClass
    public void setUp() {
        skills = new Skills();
    }

    @Test
    public void testAddSkill() {
        String expectedResult = "New Skill";
        String actualResult = skills.addSkill();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDeleteSkill() {
        String expectedResult = "Delete Skill";
        String actualResult = skills.deleteSkill();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEditSkill() {
        String expectedResult = "Edit Skill";
        String actualResult = skills.editSkill();
        assertEquals(actualResult,expectedResult);
    }
}