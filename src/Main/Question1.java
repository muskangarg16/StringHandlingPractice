package Main;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    Ques1 obj=new Ques1(s);
    obj.stringFormat(s);
    }

}
class Ques1{
    private String s;
    public Ques1(String s) {
        this.s = s;
    }
    public String getStr() {
        return s;
    }
    public void setStr(String s) {
        this.s = s;
    }
    public String stringFormat(String s){
        System.out.print("index:"+"\t");
        for(int i=0;i<s.length();i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars:"+"\t");
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+"\t");
        }
        return "";
    }
}