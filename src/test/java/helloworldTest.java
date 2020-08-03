import org.junit.Test;

import static org.junit.Assert.*;

public class helloworldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        helloworld h = new helloworld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_krittinon_should_return_Hello_krittinon() {
        helloworld h = new helloworld();
        String result = h.sayHi("krittinon");
        assertEquals("Hello Krittinon", result);
    }
    @Test
    public void sayHi_with_yup_should_return_Hello_yup() {
        helloworld h = new helloworld();
        String result = h.sayHi("yup");
        assertEquals("Hello Yup", result);
    }
}