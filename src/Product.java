import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String productTitle;
    private static List<Node> ingredients = new ArrayList<>();

    public Product(String productTitle) {
        this.productTitle = productTitle;
    }

    public boolean addProduct(Product product) {
        if (product.productTitle.isEmpty() || this == product || parentCheck(product)) {
            return false;
        }
        Node node = new Node(product, this);
        ingredients.add(node);
        return true;
    }

    private boolean parentCheck(Product product) {
        for(Node node : ingredients) {
            if (node.getParent().equals(product)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(productTitle, product.productTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTitle);
    }
}
