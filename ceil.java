public class ceil {
    // smallest number greater or equal to target
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 13, 17, 21};
        int target = 15;

        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr.length -1){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
}
