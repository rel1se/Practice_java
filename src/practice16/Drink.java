package practice16;

public final class Drink implements Item{
    private final int cost;
    private final String name;
    private final String characteristic;
    public Drink(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
        this.cost = 0;
    }
    public Drink(String name, String characteristic, int cost){
        this.name = name;
        this.characteristic = characteristic;
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("Name: ")
                .append(name)
                .append(", cost: ")
                .append(cost)
                .append(", characteristic: ")
                .append(characteristic)
                .toString();
    }
}
