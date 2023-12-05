package com.example.tritypejunittest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTritypeMutationOne() {
        // 突变1前结果
        Tritype tri_ori = new Tritype();
        assertEquals(4, tri_ori.Triang(2, 2, 7));
        // 突变1后结果
        TritypeMutantOne tri_mut1 = new TritypeMutantOne();
        assertEquals(2, tri_mut1.Triang(2, 2, 7));
    }

    @Test
    public void testTritypeMutationTwo() {
        // 突变2前结果
        Tritype tri_ori = new Tritype();
        assertEquals(4, tri_ori.Triang(2, 2, 4));
        // 突变2后结果
        TritypeMutantTwo tri_mut2 = new TritypeMutantTwo();
        assertEquals(2, tri_mut2.Triang(2, 2, 4));
    }
}