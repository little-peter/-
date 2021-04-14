

import java.util.HashMap;
import java.util.Scanner;

public class testDemo {
    public static void main1(String[] args) {
Scanner sc=new Scanner(System.in);
while(sc.hasNext()){
    int X1=sc.nextInt();//代表A-B
    int X2=sc.nextInt();//B-C
    int X3=sc.nextInt();//A+B
    int X4=sc.nextInt();//B+C
    if((X1+X3)/2.0==(X1+X3)/2&&(X2+X4)/2.0==(X2+X4)/2&&(X4-X2)/2.0==(X4-X2)/2){

        if((X1+X3)/2<0||(X2+X4)/2<0||(X4-X2)/2<0){
            System.out.println("No");
            return;
        }
int[] array={(X1+X3)/2,(X2+X4)/2,(X4-X2)/2};
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }


    }else{
        System.out.println("No");
    }

}
            }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();//输入的十进制数，注意判断正负
        int N=sc.nextInt();//要转换的进制
        HashMap<Integer,Character> map=new HashMap<Integer,Character>();
        map.put(10,'A');
        map.put(11,'B');
        map.put(12,'C');
        map.put(13,'D');
        map.put(14,'E');
        map.put(15,'F');
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        if(M<0){
            flag=true;
            M=-M;
        }
        while (M>0){
            int t=M%N;
            sb.append(map.get(t)==null?t:map.get(t)+"");
            M=M/N;
        }
        if(flag){
            System.out.println("-"+sb.reverse().toString());
        }else {
            System.out.println(sb.reverse().toString());
        }
    }

    }

