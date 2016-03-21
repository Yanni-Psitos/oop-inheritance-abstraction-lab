/**
 * Created by YPsitos on 3/21/16.
 */
public class Dog extends Pets {
    @Override
    public String feed(String food) {
        food = "Dog is fed!";
        return food;
    }

    @Override
    public String groom(String groomed) {
        groomed = "Dog is groomed!";
        return groomed;
    }

    @Override
    public String playWith(String played) {
        played = "Dog is played with!";
        return played;
    }
}
