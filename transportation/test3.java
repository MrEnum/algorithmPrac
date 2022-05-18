package transportation;

public class test3 {
    public static void main(String[] args){
        Taxi taxi1 = new Taxi(2357);

        taxi1.takeTaxi(5, " gyeonggi",5000);
        taxi1.takeTaxi(3, "gyeongi",5000);
        System.out.println("taxi Num : " + taxi1.getTaxiNum() + " Destination: " + taxi1.getDestination() + " Distance : " + taxi1.getDistnaceDestination());
        System.out.println("taxi pay : " + taxi1.getMoney() + " passenger : " + taxi1.getPassenger() + " gas : " + taxi1.getGas());
        System.out.println("distance : " + taxi1.getDistance());
        System.out.println(taxi1.getPresentMove());

        taxi1.Arrive();
        System.out.println("------arrive--------");
        System.out.println("taxi Num : " + taxi1.getTaxiNum() + " Destination: " + taxi1.getDestination() + " Distance : " + taxi1.getDistnaceDestination());
        System.out.println("taxi pay : " + taxi1.getMoney() + " passenger : " + taxi1.getPassenger() + " gas : " + taxi1.getGas());
        System.out.println("distance : " + taxi1.getDistance());
        System.out.println(taxi1.getPresentMove());

    }
}
