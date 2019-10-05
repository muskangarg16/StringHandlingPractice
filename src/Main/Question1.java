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
    private String s;
    public Ques8(String s) {
        this.s = s;
    }
    public String getStr() {
        return s;
    }
    public void setStr(String str) {
        this.s = str;
    }
}