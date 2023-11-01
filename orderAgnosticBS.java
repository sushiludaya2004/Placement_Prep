public class orderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-12, -10, -4, 0, 1, 3, 5, 8, 13, 17, 21};
        int[] arr = {21, 17, 13, 8, 5, 3, 1, 0, -4, -10, -12};
        int target = 13;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean agnostic = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(agnostic) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
