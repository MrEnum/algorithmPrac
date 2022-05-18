package transportation;
//1. 최대 승객수 0
//2. 현재 승객수
//3. 요금 0
//4. 버스 번호 0
//5. 주유량 0
//6. 현재 속도 0
//7. 상태
//    1.  운행, 차고지 행
public class Bus {
    int Money = 0;  //돈
    int Passenger = 0;  //승객
    int busNumber;  //버스 번호
    int gas = 50;   //가스 총량
    int Speed = 0;       //현재 속도
    String PresentMove = "";

    public Bus(int busNumber){
        this.busNumber = busNumber;
        this.PresentMove = "running";
    }
    public int getBusNum(){
        return busNumber;
    }
    public void takeBus(int Passenger){
        if(this.gas > 10){
            this.gas -= 10;
            this.PresentMove = "running";
        }else if(this.gas == 10){
            this.gas -= 10;
            System.out.println("Check your gas.");
        }else if(this.gas == 0){
            this.Passenger = 0;
            this.PresentMove = "stopping";
            System.out.println("Sorry, no gas.");
        }

        if(this.Passenger < 15){
            this.Passenger += Passenger;

        }else{
            System.out.println("Sorry.");
        }
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


}
