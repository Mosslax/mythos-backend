package net.s1lentm4ple.mythos;

import org.junit.jupiter.api.*;

public class MythosCommonTest {

    @Test
    public void helloWorldTest() {
        System.out.println("Hello World!");
    }

    @Nested
    class InnerTest {
        @Test
        public void helloWorldTest() {
            System.out.println("Hello World from inner class!");
        }
    }


}
