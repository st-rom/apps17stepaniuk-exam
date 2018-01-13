package ua.edu.ucu.smartarr;
import ua.edu.ucu.functions.MyPredicate;
// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends DistinctDecorator implements MyPredicate{
    @Override
    public boolean test(Object t) {
        return false;
    }
}
