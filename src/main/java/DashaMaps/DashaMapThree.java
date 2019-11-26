package DashaMaps;

public class DashaMapThree extends DashaMap implements DashaMapX {
    
    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return "" + input.toLowerCase().charAt(0) + input.toLowerCase().charAt(1);
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String input = HashFunctionThree(key);
        performSet(key, value, input);
    }

    @Override
    public String delete(String key) {
        String input = HashFunctionThree(key);
        return performDelete(key, input);
    }

    @Override
    public Integer get(String key) {
        String input = HashFunctionThree(key);
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
        String input = HashFunctionThree(key);
        return getBucketSize(input) != 0;
    }
}
