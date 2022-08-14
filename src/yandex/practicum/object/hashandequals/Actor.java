package yandex.practicum.object.hashandequals;

import java.util.Objects;

public class Actor {
    public String firstName;
    public String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean equals (Object actor){
        if (this == actor) return true;
        if ((actor == null) || getClass() != actor.getClass()) return false;
        Actor actor1 = (Actor) actor;
        return Objects.equals(firstName, actor1.firstName) && Objects.equals(lastName, actor1.lastName);
    }
    public int hashCode (){
        int hash = 1;
        if (firstName != null) {
            hash += firstName.hashCode();
        }
        if (lastName  != null){
            hash += lastName.hashCode();
        }
        return hash;
    }
}