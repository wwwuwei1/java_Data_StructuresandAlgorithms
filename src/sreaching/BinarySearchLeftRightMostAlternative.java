package sreaching;

//public class BinarySearchLeftRightMostAlternative {
//    public static int binarySearchLeftRightMostAlternative(int[]a, int target){
//        int i = 0, j = a.length - 1;
//        while( i <= j ){
//            int mid = (i + j) >>> 1;
//            if(target <= a[mid]){ //当目标值在中间值的上方或者左边时移动右边指针
//                j = mid - 1;
//            }else{
//                i = mid + 1;
//            }
//        }
//        return i;  //最后不再返回-1,而是返回一个有意义的值i,i代表着如果能找到元素,返回最左边查找到的索引
//        //如果找不到元素,返回大于等于目标的最靠左的索引位置
//    }
//}

public class BinarySearchLeftRightMostAlternative {
    public static int binarySearchLeftRightMostAlternative(int[]a, int target){
        int i = 0, j = a.length - 1;
        while( i <= j ){
            int mid = (i + j) >>> 1;
            if(target < a[mid]){ //当目标值在中间值的上方或者左边时移动左边指针
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return i - 1;  //最后不再返回-1,而是返回一个有意义的值i,i代表着如果能找到元素,返回最右边查找到的索引
        //如果找不到元素,返回小于等于目标的最靠右的索引位置
    }
}
