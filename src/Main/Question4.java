package Main;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine().trim();
        Ques4 obj=new Ques4(s);
        System.out.println(obj.occur());
    }
}
class Ques4{
private String s;
public Ques4(String s) {
    this.s = s;
    }
    public String getStr() {
        return s;
    }
    public void setStr(String s) {
        this.s = s;
    }
    public String occur(){
    StringBuffer sb=new StringBuffer();
    String wow="*^!";
    int t=0;
    for(int i=0;i<getStr().length();i++){
            char c = getStr().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                sb.append(wow.charAt(t));
                t++;
            }
            else{
                sb.append(c);
            }
            if(t>=3){
                t=0;
                i--;
            }
    }
    return sb.toString();
    }
}