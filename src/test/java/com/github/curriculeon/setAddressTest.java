package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class setAddressTest {
    private void test(String expected) {
        // Given
        Person person = new Person();

        // When
        person.setAddress(expected);
        String actual = person.getAddress();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(null);
    }


    @Test
    public void test1() {
        test("Coral Springs");
    }



    @Test
    public void test2() {
        test("Miami Florida");
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
        test("Some address in China");
    }
}
