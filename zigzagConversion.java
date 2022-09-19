import java.util.HashMap;

public class App {

   public static StringBuilder zigzagConversion(String str, int rowNum){
      char[] array = str.toCharArray();
      HashMap<Integer,StringBuilder> map = new HashMap<Integer,StringBuilder>();
      StringBuilder result = new StringBuilder("");
      //up to down
      int i=0;
      while(i<array.length){
         for(int k=0;k<rowNum && i<array.length ;k++){
            StringBuilder sb = new StringBuilder();
            if(map.containsKey(k)){
               sb = map.get(k).append(array[i++]);
               map.put(k,sb);
            }else{
               map.put(k,sb.append(array[i++]));
            }
         }
      //down to up
      for(int j=rowNum-2;j>0 && i<array.length;j--){
         StringBuilder sb = new StringBuilder();
         if(map.containsKey(j)){
            sb = map.get(j).append(array[i++]);
            map.put(j,sb);
         }
      }
   
      }   
      //reaching the result 
      for(int m=0;m<map.size();m++){
         result.append(map.get(m));
      }
      
      return result;
}

public static String convert(String s, int numRows) {
   //Define StringBuilders
   StringBuilder[] sbs = new StringBuilder[numRows];
   for(int i = 0; i < numRows; i++){
       sbs[i] = new StringBuilder();
   }
   
   //Define Variables
   char[] arr = s.toCharArray();
   int n = arr.length;
   int index = 0;
   
   //Traverse zig zag
   while(index < n){
       //Go down
       for(int j = 0; j < numRows && index < n; j++){
           sbs[j].append(arr[index++]);
       }
       //Go Up before start
       for(int j = numRows - 2; j > 0 && index < n; j--){
           sbs[j].append(arr[index++]);
       }
   }
   
   //Combine all stringbuilders into one
   StringBuilder res = sbs[0];
   for(int i = 1; i < numRows; i++){
       res.append(sbs[i].toString());
   }
   return res.toString();
}
public static void main(String[] args)
   {
      System.out.println(zigzagConversion("PAYPALISHIRING",4));
   }
}
