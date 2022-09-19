import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
 public static int lengthOfLongestSubstring(String s) {
   char[] myChar = s.toCharArray();
   int maxResult = 0;
   for(int i=0;i<myChar.length;i++){
      Set<Character> data = new LinkedHashSet<Character>();   
      int longestMax = 0;
      for(int j=i;j<myChar.length;j++){
       if(!data.contains(myChar[j])){
         data.add(myChar[j]);  
         ++longestMax;
       }else{
         longestMax=0;
         break;
         }
         if(longestMax>maxResult){
            maxResult=longestMax;
          } 
      }
   }
   return maxResult;
}
public static void main(String[] args)
   {
      System.out.println(lengthOfLongestSubstring("pwwkew"));
   }
}
