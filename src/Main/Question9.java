package Main;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Ques9 obj = new Ques9(str);
        System.out.println(obj.AbsWeight());
    }
}
class Ques9{
    String str;
    public Ques9(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public int AbsWeight(){
        int s = 0;
        int d=0;
        for (int i = 0; i < getStr().length(); i++) {
            if (getStr().charAt(i) >= 'A' && getStr().charAt(i) <= 'Z') {
                s = s + (int) getStr().charAt(i);
            }
            else{
                d=d+(int) getStr().charAt(i);;
            }
        }
        int totalweight=Math.abs(s-d);
        return totalweight;
    }
}