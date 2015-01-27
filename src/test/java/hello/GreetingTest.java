package hello;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class GreetingTest {
    @Test
    public void greeting_should_be_create() {

        long id = 1;
        String content = "Hello";

        Greeting greeting = new Greeting(id, content);

        assertEquals(greeting.getId(), 1);
        assertEquals(greeting.getContent(), content);
    }
}