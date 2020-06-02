package InheritanceMultiLevelDemo;

public class MultiLevel {
    public void Ginger(){
        System.out.println("Gingers are rodents");
    }
}//change 1
class Paddys extends MultiLevel{
    public void Yellow(){
        System.out.println("Yellow haired people are bimbos");
    }
}//changes 2
class Coral extends MultiLevel{
    public void Black(){
        System.out.println("Blacks are the lowest");
    }
    public static void main(String[] args){
        Coral obj = new Coral();
        Paddys obj1 = new Paddys();
        obj.Ginger();
        obj.Black();
    }
}
// please change this code
