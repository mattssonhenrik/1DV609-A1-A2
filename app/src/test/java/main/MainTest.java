package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test public void helloWorldDoesReturnSomething() {
        Main classUnderTest = new Main();
        assertNotNull("Main should say Hello World when loaded", classUnderTest.helloWorld());
    }

    @Test public void helloWorldReturnsHelloWorld() {
        Main classUnderTest = new Main();
        assertEquals("Assert that the returned message is Hello World", "Hello World", classUnderTest.helloWorld());
    }
}
