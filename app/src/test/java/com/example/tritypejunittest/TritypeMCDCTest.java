package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testMCDC() {
        Tritype tri = new Tritype();
        // 选择第53行 if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        // MC/DC coverage
        // T F F -> T
        assertEquals(4, tri.Triang(-1, 1, 1));
        // F T F -> T
        assertEquals(4, tri.Triang(1, -1, 1));
        // F F T -> T
        assertEquals(4, tri.Triang(1, 1, -1));
        // F F F -> F
        assertEquals(3, tri.Triang(1, 1, 1));
    }
}