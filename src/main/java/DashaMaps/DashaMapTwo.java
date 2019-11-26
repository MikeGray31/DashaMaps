package DashaMaps;
import DashaMaps.*;

public class DashaMapTwo extends DashaMap implements DashaMapX {

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return "" + input.toLowerCase().charAt(0);
        }
        return null;
    }
    
    @Override
    public void set(String key, Integer value) {
        String input = HashFunctionTwo(key);
        performSet(key, value, input);
    }

    @Override
    public String delete(String key) {
        String input = HashFunctionTwo(key);
        return performDelete(key, input);
    }

    @Override
    public Integer get(String key) {
        String input = HashFunctionTwo(key);
        return performGet(key, input);
    }

    @Override
    public boolean isEmpty() {
        return isThisEmpty();
    }

    @Override
    public long size() {
        return getSize();
    }

    @Override
    public boolean bucketSize(String key) {
        String input = HashFunctionTwo(key);
        return getBucketSize(input) != 0;
    }

}
