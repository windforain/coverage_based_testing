package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
    public void testDecision() {
        Tritype tri = new Tritype();
        // 选择第53行 if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        // decision coverage
        // 表达式为真
        assertEquals(4, tri.Triang(-1, 2, 7));
        // 表达式为假
        assertEquals(3, tri.Triang(1, 1, 1));


    }
}