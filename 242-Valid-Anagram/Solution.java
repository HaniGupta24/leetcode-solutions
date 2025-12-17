class Solution {
    
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
         char[] sArray =s.toCharArray();
            char[] tArray =t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            return Arrays.equals(sArray,tArray);
    }
    public static void main(String[]arg){
     String s = "listen";
        String t = "silent";

         
        if(isAnagram(s,t)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

