package Main;

public class Question6 {
    public static void main(String[] args) {

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
    public void setStr(String s) {
        this.str = str;
    }
    public String upper(){
    String q=getStr();
    q=q.toUpperCase();
    return q;
    }
}