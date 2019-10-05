package Main;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    String str=in.nextLine().trim();
    int index=in.nextInt();
    Ques2 obj=new Ques2(str,index);
    System.out.println(obj.stringSubstring(index));
    }
}
class Ques2{
private String str;
private int index;
    public Ques2(String str,int index) {
        this.str = str;
        this.index=index;
    }
    public String getStr() {
        return str;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public String stringSubstring(int index){
        StringBuilder sb=new StringBuilder();
        sb.append(getStr().substring(0,index));
        return sb.toString();
    }
}