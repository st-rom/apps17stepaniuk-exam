package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends BaseArray{
    @Override
    public Object[] toArray() {
        Object[] ints = new Object[]{};
        for (int i = 0; i < size() - 1; i++) {
            boolean cor = true;
            for (int j = i + 1; j < size(); j++) {
                if(super.toArray()[i].equals(super.toArray()[j])){
                    cor = false;
                }
            }
            if (cor){
                ints = appendv(ints, super.toArray()[i]);
            }
        }
        ints = appendv(ints, super.toArray()[size()]);
        return ints;
    }

    private Object[] appendv(Object[] o, Object added) {

        ArrayList<Object> al = new ArrayList<Object>(Arrays.asList(o));
        al.add(added);
        return al.toArray();

    }
}
