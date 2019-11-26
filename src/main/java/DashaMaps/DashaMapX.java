package DashaMaps;

public interface DashaMapX {
    // fundamentals
    void set(String key, Integer value);
    String delete(String key);
    Integer get(String key);
    boolean isEmpty();
    long size();

    // testing access
    boolean bucketSize(String key); // used for tests
}
