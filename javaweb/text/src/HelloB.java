import java.util.*;

public class HelloB{
    public static List<Character> func(String str1, String str2){
        List<Character>list=new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);

            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }


           return list;
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
    }
}



