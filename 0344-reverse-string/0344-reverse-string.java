class Solution {
    public void reverseString(char[] s) {
//       int left =0;
//       int right = s.length-1;

//       while(left<right){
//         char temp = s[right];
//    s[right]= s[left];
//    s[left]= temp;

//    left++;
//    right--;
//       } 


        reverse(s, 0, s.length - 1);
    }
    public static void reverse(char[]s ,int left , int right){
       if(left >= right){
        return ;
       }
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;


            reverse(s, left+1, right-1);
    }
}