import java.io.*;
import java.util.*;

public class MyHashtable<K, V> {

	private static int SIZE = 31;

	/* initialize array to store value */

	private V[] tableValues = (V[]) new Object[SIZE];
    
    public static void main(String args[]) throws Exception {
        new TestHarness(new MyHashtable<String, String>()).run();
    }
    
    public V put(K key, V value) {
    	if (value == null) {

			throw new NullPointerException();

		}

		int index = hash(key.hashCode()) % SIZE;

		tableValues[index] = value;

		return value;
    }

    public V get(K key) {
        // TODO implement
    	int index = hash(key.hashCode()) % SIZE;

		return tableValues[index];
    }
    
    private  int hash(int h) {

		h ^= (h >>> 20) ^ (h >>> 12);

		return h ^ (h >>> 7) ^ (h >>> 4);

	}
    
 

    /**
     * A helper class that tests MyHashtable by feeding it puts and gets from STDIN.
     */
    public static class TestHarness implements Runnable {
        final MyHashtable<String, String> hashtable;

        public TestHarness(MyHashtable<String, String> hashtable) {
            this.hashtable = hashtable;
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String k = scanner.next();
                String v = null;
                if (k.contains("=")) {
                    String[] split = k.split("\\=");
                    k = split[0];
                    v = split[1];
                }
                if (v == null) {
                    System.out.println(hashtable.get(k));
                } else {
                    hashtable.put(k, v);
                }
            }
        }
    }
}