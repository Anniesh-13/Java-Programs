class Vehicle2{
void run(){System.out.println("Vehicle is running");} 	}
class Bike2 extends Vehicle2{
void run(){System.out.println("Bike is running safely");} }
public class prog27 {

public static void main(String args[]){
Bike2 obj = new Bike2();
obj.run();
}
}

