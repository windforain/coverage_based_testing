package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    @Test
    public void testCondition() {
        Tritype tri = new Tritype();
        // 选择第53行 if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        // condition coverage
        // T F F
        assertEquals(4, tri.Triang(-1, 2, 7));
        // F T F
        assertEquals(4, tri.Triang(1, -2, 7));
        // F F T
        assertEquals(4, tri.Triang(1, 2, -7));

    }
}