package sreaching;

public class BinarySearchAlternative {
    public static int binarySearchAlternative(int[] a, int target){
        int i = 0, j = a.length;//第一处改动
        while(i < j){   //第二处改动,不能加上=,不然当查找不存在的数时会陷入死循环
            int m = (i + j) / 2;
            if(target < a[m]){
                j = m; //第三处改动
            }
            else if(target > a[m]) {  //目标值在中间值右边
                i = m + 1;
            }else{
                return m;  //目标值就是中间值
            }
        }
        return -1;  //没有目标值
    }
}
