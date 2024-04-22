package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

public class LionUnknownTest {


    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);
    @Mock
    Feline feline;

    Lion lion;

    @Test
    public void lionUnknownMale() {
        try {
            lion = new Lion("Что-то другое", feline);
        } catch (Exception exception) {
            return;
        }
        Assert.fail();
    }
}
