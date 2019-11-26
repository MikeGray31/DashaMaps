package DashaMaps;

public class DashaMapOne extends DashaMap implements DashaMapX {

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String input = HashFunctionOne(key);
        performSet(key, value, input);
    }

    @Override
    public String delete(String key) {
        String input = HashFunctionOne(key);
        return performDelete(key, input);
    }

    @Override
    public Integer get(String key) {
        String input = HashFunctionOne(key);
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
        String input = HashFunctionOne(key);
        return getBucketSize(input) != 0;
    }
}
