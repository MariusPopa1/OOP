package Lab0;

import java.util.Objects;

public class StoredInformation {
    float speed = 0;
    boolean isSleeping = true;
    String clothes = "naked";
    public void sleep(){
        isSleeping = true;
    }
    public void wakeUp(){
        isSleeping = false;
    }
    public void isAsleep() {
        if (isSleeping) {
            System.out.println("The person is asleep!");
        } else {
            System.out.println("The person is awake!");
        }
    }
    public void stop(){
        speed = 0;
    }
    public void isMoving(){
        if (speed == 0){
            System.out.println("The person is not moving");
        } else {
            isSleeping = false;
            System.out.println("The person is moving!");
        }
    }
    public void moveFaster(int acceleration){
        speed += acceleration;
    }
    public void change(String colour){
        clothes = colour;
    }
    public void colorOutfit() {
        if (Objects.equals(clothes, "naked")) {
            System.out.println("The person has not put on clothes yet");
        } else {
            System.out.println("The person is wearing an outfit with the colour  " + clothes);
        }
    }
    }



