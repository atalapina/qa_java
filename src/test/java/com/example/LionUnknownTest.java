package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionUnknownTest {


    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);
    @Mock
    Feline feline;

    @Test
    public void lionUnknownMale() {

        Exception exception = assertThrows(Exception.class, () -> new Lion("что-то другое", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}
