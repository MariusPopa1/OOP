package experiments;

public class Box {
    private String itemName;
    private boolean inUse;

    public Box() {
        this.itemName = null; // Box starts with no item
        this.inUse = false;  // Box is initially not in use
    }

    public void putItem(String itemName) {
        if (!inUse) {
            this.itemName = itemName;
            setInUse(true);
            System.out.println("Item '" + itemName + "' has been put in the box.");
        } else {
            System.out.println("Cannot put a new item. The box is already in use.");
        }
    }

    public boolean getInUse() {
        return inUse;
    }
    public void setInUse(Boolean inUse){
        this.inUse = inUse;
    }

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println("Is the box in use? " + box.getInUse());

        box.putItem("Item 1"); // Putting an item in an empty box
        System.out.println("Is the box in use? " + box.getInUse());

        box.putItem("Item 2"); // Attempting to put a new item while the box is in use
        System.out.println("Is the box in use? " + box.getInUse());

    }
}






