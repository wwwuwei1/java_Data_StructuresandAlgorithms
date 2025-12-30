package sreaching;

import java.util.Arrays;

public class BinarySearchJava {
    //java的版本最后为我们返回了索引,那么我们怎么将这个元素插入到我们的数组中呢
    public static int[] addIndexNumber(int[]a, int target){
        int insertIndex = Math.abs(Arrays.binarySearch(a, target) + 1); //插入点索引
        int[]b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, insertIndex);
        //解释一下System.arraycopy,也就是把要复制的数组(a)从索引0开始复制n个元素(insertIndex)到数组b,并且从b的索引0开始
        b[insertIndex] = target;
        System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
        return b;
    }
}


