package singleton.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        System.out.println(singleton.description());
    }
}