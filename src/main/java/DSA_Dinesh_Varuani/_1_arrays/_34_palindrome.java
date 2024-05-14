package DSA_Dinesh_Varuani._1_arrays;

public class _34_palindrome {
    /**
     * - class 34
     * Q. Given a string, the task is to check if a string is palindrome or not.
     * Example
     * Input: "madam"
     * Output: true
     *
     * Input: "hello"
     * Output: false
     */
    public static void main(String[] args) {
        _34_palindrome obj = new _34_palindrome();
        String str = "madam";
        boolean isPalindrome = obj.isPalindrome(str);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    private boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
