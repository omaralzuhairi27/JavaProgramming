package week02.src.door;

public class DoorApplication {
    public static void main(String[] args) {
        Door door=new Door(5);
        Key key=new Key();
        key.open(door);
    }
}
