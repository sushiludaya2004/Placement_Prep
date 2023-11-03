public class smallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a' ;

        System.out.println(nextGreatestLetter(letters, target));
    }

        static  char nextGreatestLetter(char[] letters, char target) {

            int start = 0;
            int end = letters.length - 1;

            while(start <= end) {

                int mid = start + (end - start) / 2;

                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }if(start == letters.length){
                    return letters[0];
                }
            }
            return letters[start];

        }

}
