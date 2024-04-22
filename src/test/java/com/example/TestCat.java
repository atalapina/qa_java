package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class TestCat {

    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundMeow() {
        String meow = "Мяу";
        Assert.assertEquals(meow, cat.getSound());
    }

    @Test
    public void getFoodCatEatMeat() {
        try {
            cat.getFood();
            Mockito.verify(feline, Mockito.times(1)).eatMeat();
        }catch (Exception exception){
            Assert.fail();
        }
    }

}
