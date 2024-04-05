import java.util.ArrayList;
import java.util.List;

public class Tree {

    private static Tree instance;

    private List<Node> ingredients = new ArrayList<>();

    private Tree() {
    }

    public static Tree getInstance() {
        if (instance == null) {
            instance = new Tree();
        }
        return instance;
    }

    public List<Node> getIngredients() {
        return ingredients;
    }
}
