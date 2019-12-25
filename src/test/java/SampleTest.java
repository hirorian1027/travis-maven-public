import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void calcSuccess1() throws Exception {
    	Sample sample = new Sample();
        assertEquals(3, sample.calc(1, 2), "計算が間違っています");
    }
/**
    @Test
    public void calcSuccess2() throws Exception {
    	Sample sample = new Sample();
        assertEquals(0, sample.calc(-1, -2), "計算が間違っています");
    }
    @Test
    public void calcSuccess3() throws Exception {
    	Sample sample = new Sample();
        assertEquals(0, sample.calc(0, 0), "計算が間違っています");
    }
*/
}
