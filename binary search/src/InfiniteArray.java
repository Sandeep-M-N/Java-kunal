public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 34, 56, 78, 87, 96, 101, 111, 113, 123, 145, 156, 167};
        int target = 111;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;
//            end = end + (end - start + 1) * 2;

            end = end*2;
            start = newstart;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;


    }
}


