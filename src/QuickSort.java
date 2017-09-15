import java.util.Random;

/**
 *
 * @author LORELL
 */
public class QuickSort {

    private final int[] array;
    private static final int LOW = 0;
    private static int LENGTH;

    public QuickSort(int[] array) {
        this.array = array;
        LENGTH = this.array.length - 1;
    }

    public int[] quick_srt_mid() {
        int[] result = quick_srt_mid(array, LOW, LENGTH);
        return result;
    }

    public int[] quick_srt_first() {
        int[] result = quick_srt_first(array, LOW, LENGTH);
        return result;
    }

    public int[] quick_srt_end() {
        int[] result = quick_srt_end(array, LOW, LENGTH);
        return result;
    }
    
     public int[] quick_srt_random() {
        int[] result = quick_srt_random(array, LOW, LENGTH);
        return result;
    }

    private int[] quick_srt_mid(int array[], int low, int n) {
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return array;
        }
        int pivot = array[(lo + hi) / 2];
        while (lo < hi) {
            while (lo < hi && array[lo] < pivot) {
                lo++;
            }
            while (lo < hi && array[hi] > pivot) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt_mid(array, low, lo);
        quick_srt_mid(array, lo == low ? lo + 1 : lo, n);
        return array;
    }

    private int[] quick_srt_first(int array[], int low, int n) {
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return array;
        }
        int pivot = array[lo];
        while (lo < hi) {
            while (lo < hi && array[lo] < pivot) {
                lo++;
            }
            while (lo < hi && array[hi] > pivot) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt_first(array, low, lo);
        quick_srt_first(array, lo == low ? lo + 1 : lo, n);
        return array;
    }

    private int[] quick_srt_end(int array[], int low, int n) {
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return array;
        }
        int pivot = array[hi-1];
        while (lo < hi) {
            while (lo < hi && array[lo] < pivot) {
                lo++;
            }
            while (lo < hi && array[hi] > pivot) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt_end(array, low, lo);
        quick_srt_end(array, lo == low ? lo + 1 : lo, n);
        return array;
    }
    
    private int[] quick_srt_random(int array[], int low, int n) {
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return array;
        }
        Random rnd = new Random();
        int pivot = rnd.nextInt()* (hi+lo);
        while (lo < hi) {
            while (lo < hi && array[lo] < pivot) {
                lo++;
            }
            while (lo < hi && array[hi] > pivot) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt_end(array, low, lo);
        quick_srt_end(array, lo == low ? lo + 1 : lo, n);
        return array;
    }
}
