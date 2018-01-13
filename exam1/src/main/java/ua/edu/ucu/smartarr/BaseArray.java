package ua.edu.ucu.smartarr;



// Base array for decorators
abstract class BaseArray implements SmartArray{
    //private final List<Integer> ints;
    private Object[] ints;
    public BaseArray(int... ints){
        //this.ints = new ArrayList<Integer>(Arrays.asList(ints));
        this.ints = new Object[]{ints};
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return ints;
    }

    @Override
    public int size() {
        return ints.length;
    }
}
