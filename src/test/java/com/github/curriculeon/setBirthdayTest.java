package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class setBirthdayTest {
    private void test(Date expected) {
        // Given
        Person person = new Person();

        // When
        person.setBirthday(expected);
        Date actual = person.getBirthday();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        test(null);
    }


    @Test
    public void test1() {
        test(new Date());
    }



    @Test
    public void test2() {
        test(new Date());
    }



    @Test
    public void test3() {
        test(new Date());
    }



    @Test
    public void test4() {
        test(new Date());
    }


    @Test
    public void test5() {
        test(new Date());
    }
}
