import logic.BubbleSort;
import logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> bubbleSort = new BubbleSort<>();
        System.out.println("[result] " + bubbleSort.sort(Arrays.asList(args)));
    }
}
