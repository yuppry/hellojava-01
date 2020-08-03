import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่างค่า", result);
    }

    @Test
    public void new_buffer_size_should_be_10() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isFull();
        assertFalse("Buffer ไม่เต็มค่า", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มค่า", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void overwrite_C_to_fulled_buffer() {
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        for (int i = 0; i < 10; i++) {
            cb.writeData("C" + i);
        }
        cb.writeData("C");
        assertEquals("C",cb.readData());
    }

    @Test
    public void writing_12_times_should_overwrite() {
        CircularBuffer cb = new CircularBuffer();
        for(int i = 0;i<10;i++){
            cb.writeData(Integer.toString(i));
        }
        cb.writeData("C");
        cb.writeData("C");
        cb.readData();
    }

}