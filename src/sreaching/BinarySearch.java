package sreaching;

public class BinarySearch {
    public static int binarySearchBasic(int[] a, int target){
        int i = 0, j = a.length - 1; //设置指针和初值
        while(i <= j){   //范围内有东西,进入循环
            int m = (i + j) / 2;  //中间值
            if(target < a[m]){  //目标值在中间值左边
                j = m - 1;
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
