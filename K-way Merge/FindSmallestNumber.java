import java.util.*;

class Pair {
  int num;
  int listNum;
  public Pair(int num, int listNum) {
    this.num = num;
    this.listNum = listNum;
  }
}

class FindSmallestNumber {

  public static int findKthSmallest(List<Integer[]> lists, int k) {
    /*
    add each num from lists to min heap
    for k times pop from heap and add from respective list
      get list, add num from list to heap, inc ptr of list
    runtime o(klog(k)), o(num lists)
    */
    Queue<Pair> minHeap = initializeHeap(lists);
    int[] ptrsOfNumsInHeap = new int[lists.size()];
    int kthSmallest = -1;
    for (int i = 0; i < k; i++) {
      if (minHeap.size() > 0) {
        kthSmallest = updateHeap(minHeap, lists, ptrsOfNumsInHeap);
        System.out.println(kthSmallest);
      }
    }
    return kthSmallest;
  }

  public static Queue<Pair> initializeHeap(List<Integer[]> lists) {
    PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>((a, b) -> a.num - b.num);
    for (int i = 0; i < lists.size(); i++) {
      minHeap.add(new Pair(lists.get(i)[0], i));
    }
    return minHeap;
  }

  public static int updateHeap(Queue<Pair> minHeap, List<Integer[]> lists, int[] ptrsOfNumsInHeap) {
    Pair p = minHeap.remove();
    int listNum = p.listNum;
    ptrsOfNumsInHeap[listNum] += 1;
    int listIdx = ptrsOfNumsInHeap[listNum];
    if (listIdx < lists.get(listNum).length) {
      minHeap.add(new Pair(lists.get(listNum)[listIdx], listNum));
    }
    return p.num;
  }
}
