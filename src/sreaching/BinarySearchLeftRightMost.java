package sreaching;

public class BinarySearchLeftRightMost {
    public static int binarySearchLeftRightMost(int[] a, int target) {
        int i = 0, j = a.length - 1;
        int candidate = -1;
        while (i <= j) {
            int mid = (i + j) >>> 1;
            if (a[mid] < target) {
                j = mid - 1;
            } else if (a[mid] > target) {
                i = mid + 1;
            } else {
                //记录候选位置
                candidate = mid;
                j = mid - 1;
                //RightMost的区别是j = mid - 1改为 i = mid + 1,向右找
            }
        }
        return candidate;
    }
}