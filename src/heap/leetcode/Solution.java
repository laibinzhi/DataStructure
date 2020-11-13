package heap.leetcode;

import queue.PriorityQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 * 前 K 个高频元素
 */
public class Solution {


    private static class Freq implements Comparable<Freq> {
        public int value;
        public int time;

        public Freq(int value, int time) {
            this.value = value;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Freq{" +
                    "value=" + value +
                    ", time=" + time +
                    '}';
        }


        @Override
        public int compareTo(Freq other) {
            if (this.time > other.time) {
                return -1;
            } else if (this.time < other.time) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Freq> freqPriorityQueue = new PriorityQueue<>();

        for (int key : map.keySet()) {
            if (freqPriorityQueue.getSize() < k) {
                freqPriorityQueue.enqueue(new Freq(key, map.get(key)));
            } else if (map.get(key) > freqPriorityQueue.getFront().value) {
                freqPriorityQueue.dequeue();
                freqPriorityQueue.enqueue(new Freq(key, map.get(key)));
            }
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        while (!freqPriorityQueue.isEmpty()) {
            linkedList.add(freqPriorityQueue.dequeue().value);
        }

        return linkedList;

    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 1, 2};
        int k = 2;
        List<Integer> list = topKFrequent(array, k);
        System.out.println("前" + k + "个高频元素是====");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
