public class Pivot {
    public static void main(String[] args) {
        //int[] arr = {4,5,6,7,0,1,2};
        //int[] arr = {4,5,6,7,0};
        int[] arr = {7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

}
