package practice12_15.ex2;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;
    public void separate(String strAddress){
        String[] array = strAddress.split("(, )|(: )|(; )|(/ )|(- )|(. )");
        country = array[0];
        region = array[1];
        city = array[2];
        street = array[3];
        house = array[4];
        building = array[5];
        apartment = array[6];
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append(country)
                .append(" ")
                .append(region)
                .append(" ")
                .append(city)
                .append(" ")
                .append(street)
                .append(" ")
                .append(house)
                .append(" ")
                .append(building)
                .append(" ")
                .append(apartment)
                .toString();
    }
}
