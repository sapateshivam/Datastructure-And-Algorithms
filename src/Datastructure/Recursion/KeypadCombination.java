package Datastructure.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    static String codes[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> combination(String num) {
        if (num.length() == 0) {
            ArrayList<String> baseresult = new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char ch = num.charAt(0);
        String subString = num.substring(1);
        ArrayList<String> combList = combination(subString);
        ArrayList<String> resultList = new ArrayList<>();
        String indexString = codes[ch - '0'];
        for (int i = 0; i < indexString.length(); i++) {
            char chcode = indexString.charAt(i);
            for (String str : combList) {
                resultList.add(chcode + str);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = new String();
        num = sc.next();
        ArrayList<String> strings = combination(num);
        System.out.println(strings);

    }
}
