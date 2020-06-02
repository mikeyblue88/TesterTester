package InteritanceSingleDemo;

public class MyFamily{
    public void MyFamily(){
        System.out.println("My family extends");
    }
}
class MyFamily2 extends MyFamily {
    public void KarlysFamily() {
        System.out.println("Karlys Family");
    }


    public static void main(String[] args){
        MyFamily2 obj = new MyFamily2();
        obj.MyFamily();
        obj.KarlysFamily();
    }
}