package practice12_15.ex2;

public class Application {
    public static void main(String[] args) {
        Address address= new Address();
        address.separate("COUNTRY, REGION, CITY, STREET, HOUSE, BUILDING, APARTMENT");
        System.out.println(address);
        address.separate("COUNTRY, REGION: CITY, STREET. HOUSE- BUILDING/ APARTMENT");
        System.out.println(address);
    }
}
