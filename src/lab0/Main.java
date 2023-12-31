package lab0;

class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.moveFaster(5);
        person.isMoving(); // The person is moving since his speed is not 0.
        person.isAsleep(); // The person is not asleep since he is walking(no night walkers here);
        person.stop();
        person.sleep();
        person.isAsleep(); // The person has both stopped and went to sleep, so he is asleep now.
        person.colorOutfit(); // The person has not changed yet, so he is naked.
        person.change("red");
        person.colorOutfit(); // The person put on red clothes, thus he is now wearing a red outfit
    }
}