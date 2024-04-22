package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Spy

    Feline feline;
    @Test

    public void eatMeat() {
        try {
            var felineMeal = feline.eatMeat();
            Assert.assertEquals(felineMeal, List.of("Животные", "Птицы", "Рыба"));
        }catch(Exception exception){
            Assert.fail();
        }
    }

    @Test
    public void felineGetFamily() {
        String family = "Кошачьи";
        Assert.assertEquals(family, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
    @Test
    public void testGetKittens3()
    {
        Assert.assertEquals(3, feline.getKittens(3));
        Mockito.verify(feline, Mockito.times(1)).getKittens(3);
    }

}