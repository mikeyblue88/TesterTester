package InheritanceHeirarchicalDemo;

public class TrainStations {
    public void DagenhamEast(){
        System.out.println("I used to live at Dagenham East");
    }
}
class TrainStation extends TrainStations{
    public void DagenhamHeathway(){
        System.out.println("Next Stop Heathway");
    }
}
class EvenMoreStations extends TrainStation {
    public void Becontree() {
        System.out.println("I now live near Becontree");
    }

    public static void main(String[] args) {
        EvenMoreStations home = new EvenMoreStations();
        home.DagenhamEast();
        home.DagenhamHeathway();
        home.Becontree();
    }
}