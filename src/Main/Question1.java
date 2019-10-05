package Main;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    Ques1 obj=new Ques1(s);
    System.out.println(obj.stringFormat());
    }

}
class Ques1{
    private String str;
    public Ques8(String str) {
        this.str = str;
    }
}