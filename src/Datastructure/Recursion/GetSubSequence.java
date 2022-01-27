package Datastructure.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
   public static ArrayList<String> getSubSequence(String str){
       if(str.length()==0){
           ArrayList<String> baseresult =new  ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char ch = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> rrs = getSubSequence(subString);
        ArrayList<String> mainresult  = new ArrayList<>();
        for(int i = 0;i< rrs.size();i++){
            mainresult.add(""+rrs.get(i));
            mainresult.add(ch+rrs.get(i));
        }
        return mainresult;
   }

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        System.out.println(getSubSequence(str));
        
    }
}
