package Main;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Ques7 obj=new Ques7(str);
        System.out.println(obj.totweight());
    }
}
class Ques7{
    private String str;
    Ques7(String str){
    this.str=str;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public int totweight(){
        int a=0;
        for(int i=0;i<getStr().length();i++){
            a=a+(int)getStr().charAt(i);
        }
        return a;
    }
}