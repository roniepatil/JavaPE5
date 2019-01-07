package com.stackroute.rohit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecArrElementTest {
    UpdateSpecArrElement obj;
    @Before
    public void setUp() throws Exception {
        obj=new UpdateSpecArrElement();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateAndClean(){
        List<String > InMessage=new ArrayList<String>();
        InMessage.add("grapes");
        InMessage.add("mango");
        InMessage.add("orange");
        InMessage.add("banana");
        List<String> expected=new ArrayList<String>();
        InMessage.add("kiwi");
        InMessage.add("mango");
        InMessage.add("orange");
        InMessage.add("banana");
        assertEquals(expected,obj.updateSpecificElements(InMessage,"kiwi",0));
    }
}
