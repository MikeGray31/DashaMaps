package DashaMaps;

public interface DashaMapX {
    // fundamentals
    void set(String key, String value);
    String delete(String key);
    String get(String key);
    boolean isEmpty();
    long size();

    // testing access
    boolean bucketSize(String key); // used for tests
}
