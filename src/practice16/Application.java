package practice16;

public class Application {
    public static void main(String[] args) {
        Order order = new Order();
        Dish burger = new Dish("Burger", "Cheeseburger", 200);
        order.add(new Dish("Pizza", "Pepperoni"));
        order.add(burger);
        order.add(new Drink("Cocktail", "Margarita", 300));
        System.out.println(order);
        order.remove(burger);
        System.out.println(order);
    }
}
