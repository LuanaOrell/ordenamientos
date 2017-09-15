import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LORELL
 */
public class MergeSortTest {
    
    private MergeSort instance;
    private int[] array;
    int[] expected;
    
    @Before
    public void setUp() {
        array = new int[] {1,4,6,87,5,10,2,23,15,76};
        expected = new int[] {1,2,4,5,6,10,15,23,76,87};
        instance = new MergeSort(array);
    }
    
    @Test
    public void merge() {
        int[] result = instance.mergeSort();
        
        assertArrayEquals(expected, result);
    }
}
