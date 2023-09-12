import java.util.Objects;

public class Stored_Information {
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
    public void colorOutfit(){
        if (Objects.equals(clothes, "naked")){
            System.out.println("The person has not put on clothes yet");
        } else {
            System.out.println("The person is wearing an outfit with the colour " + clothes);
        }
    }
    public static void main(String[] args){
        Stored_Information person = new Stored_Information();
        person.moveFaster(5);
        person.isMoving(); // The person is moving since his speed is not 0.
        person.isAsleep(); // The person is not asleep since he is walking(no night walkers here);
        person.stop();
        person.sleep();
        person.isAsleep(); // The person has both stopped and went to sleep, so he is asleep now.
        person.colorOutfit(); // The person has not changed yet, so he is naked.
        person.change("red");
        person.colorOutfit(); // The person put on red clothes, thus he is now wearing a red outfit.
        }

    }



