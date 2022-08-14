package yandex.practicum.object;

import java.util.ArrayList;

public class LostAndFoundOffice {
    ArrayList<Object> things = new ArrayList<>(); // создайте список things

    public void put(Object object) {
        things.add(object);
    }

    public boolean check(Object object) {
        return (things.contains(object));
    }
}

// реализуйте метод put()

    // реализуйте метод check()

    /*for (Object object : things) { // логика проверки вещи в списке
        if(object.equals(target)) {
            return true;
        }*/
