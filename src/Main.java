import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w = sc.nextLine();
        char[] a=w.toCharArray();
        char[] b=s.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    b[j]=2;
                    break;
                }
            }
        }
        int count=0;
        for(int j=0;j<b.length;j++){
            if(b[j]==2){
                count++;
            }
        }
        if(count==a.length){
            int f=b.length-a.length;
            System.out.println("Yes"+" "+f);
        }
        else {
            int f=a.length-count;
            System.out.println("No"+" "+f);
        }
    }
}