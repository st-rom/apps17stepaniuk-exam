package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends BaseArray implements MyComparator {
    MyComparator cmp = new MyComparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Integer) o1) - ((Integer) o2);
        }
    };

    @Override
    public Object[] toArray() {
        return Arrays.sort(super.toArray());;
    }
}
