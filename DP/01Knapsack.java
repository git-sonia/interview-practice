import java.util.*;

public class Main{
   public static int findMaxKnapsackProfit(int capacity, List<Integer> weights, List<Integer> values) {
      int[] profits = new int[capacity + 1];
      profits[0] = 0;
      for (int i = 0; i < values.size(); i++) {
        for (int c = 1; c <= capacity; c++) {
          int weight = weights.get(i);
          int value = values.get(i);
          if (weight <= c) {
            profits[c] = Math.max(profits[c], profits[c - weight] + value);
          }
        }
      }
      
      return profits[capacity];
   }
}
