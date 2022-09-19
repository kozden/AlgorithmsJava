import java.util.LinkedHashSet;
import java.util.Set;

public class Palindrome {
   public static boolean isPalindrome(char[] s, int k, int l){
      for(int i=0;i<s.length;i++){
         if((k-i)>=0 && (l+i)<=s.length-1){
            if(s[k-i]!=s[l+i]){
               return false;
            }
         }
      }
      return true;
   }
   
   public static boolean palindromeOrNot(String str){
      char[] c = str.toCharArray();
      boolean result = false;
      if(c.length%2==0){
         result = isPalindrome(c, c.length/2-1, c.length/2);
      }else{
         result = isPalindrome(c, c.length/2, c.length/2);
      }
      return result;
}
public static void main(String[] args)
   {
      System.out.println(palindromeOrNot("aabb"));
   }
}
