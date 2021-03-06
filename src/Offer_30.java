
/**
 * 连续子数组的最大和
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},
 * 连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 * @author xxxxx
 * 
 * 思路：
 * 难点在不是从0开始的。也就是说中间连续也算。
 * 极限的话，去掉多余的负数相加，但是怎么确定负数之后存在整数。
 *
 */
public class Offer_30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0)
            return 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i; j < array.length; j++) {
                temp+=array[j];
                if(max < temp)
                    max = temp;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Offer_30 aOffer_30 = new Offer_30();
        int[] aa = {1,-2,3,10,-4,7,2,-5};
        System.out.println(aOffer_30.FindGreatestSumOfSubArray(aa));;
    }
}
