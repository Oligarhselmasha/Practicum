package yandex.practicum.object.toString;

import java.util.Arrays;

class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String extraInfo;
    public String[] residents;

    @Override
    public String toString() {
        String result = "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber + '\'';

        if(extraInfo != null) {
            result = result + ", extraInfo.length=" + extraInfo.length();
        } else {
            result = result + ", extraInfo=null";
        }

        return result + ", residents=" + Arrays.toString(residents) + '}';
    }
}

public class Practicum {
    public static void main(String[] args) {
        Address house = new Address(); // cоздаём объект и инициализируем его поля
        house.city = "Комсомольск-на-Амуре";
        house.street = "Победы";
        house.houseNumber = 33;
        house.extraInfo = "Три";
        house.residents = new String[]{ "Агафон Лыков", "Ульяна Скрябина" };
        System.out.println(house);
    }
}