package Main;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Ques3 obj = new Ques3(str);
        System.out.println(obj.replaceString());
    }
}
class Ques3 {
    private String str;

    public Ques3(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String replaceString() {
        String t = getStr();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                t=t.replace(c, '*');
            }
        }
            return t;
    }
}
