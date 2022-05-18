package transportation;

public class test2 {
    public static void main(String[] args){
        Bus bus = new Bus(11);
        System.out.println("--------" + bus.getPresentMove() + "-------");

        bus.takeBus(3);
        bus.speedUp(100);
        System.out.println("--------" + bus.getPresentMove() + "-------");

        bus.takeBus(1);
        System.out.println("busNumber: "+ bus.getBusNum() + ", Passengers: " + bus.getPassenger() + ", Gas : " + bus.getGas() + ", Speed: " + bus.getSpeed());

        bus.takeBus(1);
        System.out.println("busNumber: "+ bus.getBusNum() + ", Passengers: " + bus.getPassenger() + ", Gas : " + bus.getGas());

        bus.takeBus(1);
        bus.takeBus(1);
        System.out.println("--------" + bus.getPresentMove() + "-------");

        bus.gasCharge();
        System.out.println("gas : " + bus.getGas());
        bus.takeBus(5);
        System.out.println("busNumber: "+ bus.getBusNum() + ", Passengers: " + bus.getPassenger() + ", Gas : " + bus.getGas());
        System.out.println("--------" + bus.getPresentMove() + "-------");
//        bus.takeBus(1);
//        bus.takeBus(1);
//        bus.takeBus(1);
//        bus.takeBus(1);
//        bus.takeBus(1);
    }
}
