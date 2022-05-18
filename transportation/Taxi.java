package transportation;

public class Taxi {
    String Destination = "";
    int DistnaceDestination;
    int Distance;

    int Money = 4000;  //돈
    int Passenger = 0;  //승객
    int TaxiNumber;  //버스 번호
    int gas = 50;   //가스 총량
    int Speed = 0;       //현재 속도
    String PresentMove = "";

    public Taxi(int taxiNumber){
        this.TaxiNumber = taxiNumber;
        this.PresentMove = "can board";
    }
    public int getTaxiNum(){
        return TaxiNumber;
    }
    public void takeTaxi(int passenger, String destination, int distanceDestination ){
        if (passenger > 4) {
            System.out.println("sorry, too much people");
        }else if(this.Passenger > 0){
            System.out.println("sorry, you can't.");
        }else{
            this.Passenger += passenger;
            this.PresentMove = "can't board";
            this.gas -= 10;
            if (distanceDestination > 2400){
                this.DistnaceDestination = distanceDestination;
                this.Money += ((distanceDestination - 2400) /100) * 500;
            }
            this.Destination = destination;
        }

    }
    public String getDestination(){
        return Destination;
    }
    public int getDistnaceDestination(){
        return DistnaceDestination;
    }
    public int gasCharge(){
        return this.gas = 100;
    }

    public int getMoney(){
        return Money;
    }
    public void speedUp(int Speed){
        this.Speed += Speed;
    }
    public void speedDown(int Speed){
        this.Speed -= Speed;
    }
    public int getSpeed(){
        return Speed;
    }
    public int getGas(){return gas;}
    public int getPassenger(){
        return Passenger;
    }
    public String getPresentMove(){
        return this.PresentMove;
    }
    public void Arrive(){
        this.PresentMove = "can board";
        this.Passenger = 0;
        this.Destination = "";
        this.Distance += DistnaceDestination;
        this.DistnaceDestination = 0;
        this.Money = 0;
    }
    public int getDistance(){
        return Distance;
    }

}
