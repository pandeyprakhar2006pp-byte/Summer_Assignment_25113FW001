//Wap to remove duplicates

public class RemoveDuplicatesString {
     public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        boolean[]map=new boolean[26];
        String str= "aapnnnacolleegee";
        removeDuplicates(str,0,sb,map);
     }
     public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean[]map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
       char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
       
     }
    }
