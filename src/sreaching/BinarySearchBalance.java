package sreaching;

public class BinarySearchBalance {
    public static int binarySearchBalance(int[]a, int target){
        int i = 0, j = a.length;
        while(1 < j - i){
            int mid = (i + j) >>> 1;
            if(target < a[mid]){ //避免了else if 的使用,避免了数据查找效率不均匀的情况
                j = mid;
            }else {
                i = mid; //i = mid, 不能再+1了,否则就考虑不到正好在索引为1的情况了
            }
        }
        if(target == a[i]){
            return i;
        }else{
            return -1;
        }
    }
}
