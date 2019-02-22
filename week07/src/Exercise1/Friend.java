package week07.src.Exercise1;

public class Friend {
    private String name;
    private Integer money;

    public Friend(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return name +" "+ money;

    }
}
