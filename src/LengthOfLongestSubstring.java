import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubstring {  	  
    public static int lengthOfLongestSubstring(String str) { 
    	if(str == null || str.length() == 0){
    		return 0;
    	}
        Map<Character,Integer> map = new HashMap<Character,Integer>();  
        int maxLength = 0;  
        int now = 0;  
        int length = str.length();
        for(int i = 0;i < length;i++){    
            if(map.containsKey(str.charAt(i))){   
                now = Math.max(map.get(str.charAt(i)) + 1,now);  
                if((i - now + 1) > maxLength){  
                    maxLength = i - now + 1;         
                }  
            }else{  
                if((i - now + 1) > maxLength){  
                    maxLength = i - now + 1;  
                }  
            }  
            map.put(str.charAt(i), i);  
        }  
        return maxLength;  
    }  

	public static void main(String[] args) {
		String str = "abbbbcdefghijklmn";
		System.out.println(lengthOfLongestSubstring(str));
	}
}
