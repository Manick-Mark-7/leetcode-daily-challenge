package leetcode.binarySearch.daily_challenge;

import java.util.Arrays;

public class Design_HashMap_Oct_04 {
    class MyHashMap {
        int[] data;
        public MyHashMap() {
            data = new int[1000001];
            Arrays.fill(data,-1);
        }

        public void put(int key, int value) {
            data[key] = value;
        }

        public int get(int key) {
            return data[key];
        }

        public void remove(int key) {
            data[key] = -1;
        }
    }
}
