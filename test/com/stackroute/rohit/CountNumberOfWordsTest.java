package com.stackroute.rohit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountNumberOfWordsTest {
    CountNumberOfWords obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountNumberOfWords();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countNumberCorrect() {
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> expected=new HashMap<String, Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,obj.countNumber(str));
    }
}