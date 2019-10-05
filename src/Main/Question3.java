package Main;

public class Question3 {
}
class Ques3{
    private String str;
    public Ques3(String str){
        this.str=str;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public String replaceString(){
        String t=getStr();
        t=getStr().replace("aeiouAeiou","*");
        return t;
    }
}
