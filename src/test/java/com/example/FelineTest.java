package com.example;


import org.junit.Test;
import org.junit.Assert;
import java.util.List;



public class FelineTest {

    Feline feline = new Feline();
    @Test

    public void eatMeat() throws Exception{
            var felineMeal = feline.eatMeat();
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), felineMeal);
    }

    @Test
    public void felineGetFamily() {
        String family = "Кошачьи";
        Assert.assertEquals(family, feline.getFamily());
    }

    @Test
    public void testGetKittens1() {
        Assert.assertEquals(1,feline.getKittens());
    }
    @Test
    public void testGetKittens3()
    {
        Assert.assertEquals(3,feline.getKittens(3));
    }

}