package Main;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Ques8 obj = new Ques8(str);
        System.out.println(obj.UpperWeight());
    }
}
class Ques8 {
    private String str;
    public Ques8(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }

    public int UpperWeight() {
        int s = 0;
        for (int i = 0; i < getStr().length(); i++) {
            if (getStr().charAt(i) >= 'A' && getStr().charAt(i) <= 'Z') {
                s = s + (int) getStr().charAt(i);
            }
        }
        return s;
    }
}


