/**
 * Created by YPsitos on 3/21/16.
 */
public class Cat extends Pets {
    @Override
    public String feed(String food) {
        food = "Cat is fed!";
        return food;
    }

    @Override
    public String groom(String groomed) {
        groomed = "Cat is groomed!";
        return groomed;
    }

    @Override
    public String playWith(String played) {
        played = "Cat is played with!";
        return played;
    }
}
