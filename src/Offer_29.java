import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最小的K个数
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author xxxxx
 *
 * 思路：
 * 经典topN问题
 * 可以排序，然后遍历。
 * 也可以分段处理。
 * 还可以用堆处理。
 * 无论怎样都避不开全数据遍历。排序只是提升遍历效率。
 * 投机一下，利用PriorityQueue自动排序的功能。
 */
public class Offer_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        
        for (int i = 0; i < input.length; i++) {
            if(maxHeap.size()<k){
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek() > input[i]){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
      
        for (Integer integer : maxHeap) {
            result.add(integer); 
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Offer_29 aOffer_29 = new Offer_29();
        int[] aa = {4,5,1,6,2,7,3,8};
        aOffer_29.GetLeastNumbers_Solution(aa,4);
        
    }
}
