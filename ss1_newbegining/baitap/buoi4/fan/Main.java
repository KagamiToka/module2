package baitap.buoi4.fan;

public class Main {
    public static void main(String[] args) {
        OnlyFan fan = new OnlyFan();
        fan.setON(true);
        fan.setRadius(5);
        fan.setColor("blue");
        System.out.println(fan);

        OnlyFan fan2 = new OnlyFan(2,true, 10, "red");
        System.out.println(fan2);
        OnlyFan fan3 = new OnlyFan(1,false, 15, "green");
        System.out.println(fan3);
    }
}
