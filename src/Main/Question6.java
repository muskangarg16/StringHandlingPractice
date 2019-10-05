package Main;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        Ques6 obj=new Ques6(str);
        System.out.println(obj.upper());
    }
}
class Ques6{
private String str;
public Ques6(String str){
    this.str=str;
}
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public String upper(){
    String q=getStr();
    q=q.toUpperCase();
    return q;
    }
}