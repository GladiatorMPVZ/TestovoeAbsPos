import java.util.Objects;

public class Product {
    private String productTitle;
    private Tree ingredientTree = Tree.getInstance();

    public Product(String productTitle) {
        this.productTitle = productTitle;
    }

    public boolean addProduct(Product product) {
        Node node = new Node(product, this);
        ingredientTree.getIngredients().add(node);
        if (this == product || parentCheck(product)) {
            return false;
        }
        return true;
    }

    private boolean parentCheck(Product product) {
        for(Node node : ingredientTree.getIngredients()) {
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
