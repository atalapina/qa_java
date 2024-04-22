package com.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

@RunWith(Parameterized.class)

public class LionTest {
    private final String sex;
    private final boolean hasMane;

    public LionTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);
    @Mock
    Feline feline;

    Lion lion;
    @Before
    public void setUp() throws Exception {
        lion = new Lion(sex, feline);
    }
    @Parameterized.Parameters
    public static Object[][] test() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.verify(feline, Mockito.never()).getKittens(1);
    }

    @Test
    public void doesHaveMane() {
            Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFood() {
        try {
            lion.getFood();
            Mockito.verify(feline).eatMeat();
        }catch(Exception exception){
            Assert.fail();
        }
    }
}