package InheritanceMultiLevelDemo;

public class MultiLevel {
    public void Ginger(){
        System.out.println("Gingers are rodents");
    }
}
class Paddys extends MultiLevel{
    public void Yellow(){
        System.out.println("Yellow haired people are bimbos");
    }
}
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
