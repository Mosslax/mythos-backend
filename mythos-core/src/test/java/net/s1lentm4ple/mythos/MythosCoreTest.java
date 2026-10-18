package net.s1lentm4ple.mythos;

import org.junit.jupiter.api.*;

import java.nio.file.*;

public class MythosCoreTest {

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
    @Test
    public void fileTest() {
        Path filePath = Path.of("file.txt");
    }

}
