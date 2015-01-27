package hello;

import org.junit.Test;

import hello.Greeting;

public class GreetingTest {
    @Test
    public void greeting_should_be_create() {

        long id = 1;
        String content = "Hello";

        Greeting greeting = new Greeting(id, content);

        assertEquals(greeting.getId(), id);
        assertEquals(greeting.getContent(), content);
    }
}