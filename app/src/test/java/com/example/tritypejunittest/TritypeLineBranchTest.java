package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;



import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class TritypeLineBranchTest {

    @Test
    public void testTriangulation() throws IOException {
        // 测试main()与getN()，构造输入流测试readLine()与NumberFormatException异常
        Tritype tri = new Tritype();
        String input = "1";
        final InputStream oldIn = System.in;
        final PrintStream oldOut = System.out;
        InputStream streamIn = new ByteArrayInputStream((input).getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream streamOut = new PrintStream(outContent);
        System.setIn(streamIn);
        System.setOut(streamOut);
        tri.main(null);
        System.setIn(oldIn);
        System.setOut(oldOut);
        assertEquals(true, outContent.toString().contains("equilateral"));


        // 构造输入流测试IOException异常
        InputStream in = mock(InputStream.class);
        when(in.read()).thenThrow(new IOException());
        System.setIn(in);
        tri.main(null);
        System.setIn(oldIn);

        // 普通三角形
        assertEquals(1, tri.Triang(3, 4, 5));

        // 等腰三角形
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(2, tri.Triang(2, 3, 2));
        assertEquals(2, tri.Triang(3, 2, 2));

        // 等边三角形包含在readLine()测试中，省略

        // 非法三角形
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(-3, 4, 5));
        assertEquals(4, tri.Triang(5, 2, 2));
    }

}
