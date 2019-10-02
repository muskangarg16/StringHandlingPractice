package Main;
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    char chr=in.next().charAt(0);
    Ques11 obj=new Ques11(str,chr);
    System.out.print(obj.ind());
    }
}
class Ques11{
private String str;
private char chr;
public Ques11(String str,char chr){
    this.str=str;
    this.chr=chr;
}
    public String getStr(){
    return str;
}
    public char getChr(){
    return chr;
    }
    public void setStr(String str){
    this.str=str;
    }
    public void setChr(){
    this.chr=chr;
    }
    public String ind(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<getStr().length();i++){
            if(getStr().charAt(i)==getChr()){
                sb.append(i+"\n");
            }
        }
        return sb.toString();
    }
}