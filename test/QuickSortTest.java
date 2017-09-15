import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LORELL
 */
public class QuickSortTest {
    
    private QuickSort instance;
    private int[] array;
    int[] expected;
    
    @Before
    public void setUp() {
        array = new int[] {1,4,6,87,5,10,2,23,15,76};
        expected = new int[] {1,2,4,5,6,10,15,23,76,87};
        instance = new QuickSort(array);
    }
    
    @Test
    public void quickMiddle() {
        int[] result = instance.quick_srt_mid();
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void quickFirst() {
        int[] result = instance.quick_srt_first();
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void quickEnd() {
        int[] result = instance.quick_srt_end();
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void quickRandom() {
        int[] result = instance.quick_srt_random();
        
        assertArrayEquals(expected, result);
    }
}
