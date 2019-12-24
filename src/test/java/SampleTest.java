import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void index() throws Exception {
    	Sample sample = new Sample();
        assertEquals(sample.calc(1, 2), 3, "計算が間違っています");
    }
}