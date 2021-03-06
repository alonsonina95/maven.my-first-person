package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class setFirstNameTest {
    private void test(String expected) {
        // Given
        Person person = new Person();

        // When
        person.setFirstName(expected);
        String actual = person.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(null);
    }


    @Test
    public void test1() {
        test("Dan Winter");
    }



    @Test
    public void test2() {
        test("David Berlinski");
    }



    @Test
    public void test3() {
        test("Steven C Meyers");
    }



    @Test
    public void test4() {
        test("Heart Harmonics");
    }


    @Test
    public void test5() {
        test("Phase Conjugate Negentropic Charge Collapse");
    }
}
