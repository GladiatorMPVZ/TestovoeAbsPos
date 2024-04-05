public class Product {
    private String name;
    private Tree ingredients = Tree.getInstance();

    public Product(String name) {
        this.name = name;
    }

    public boolean addProduct(Product product) {
        Node node = new Node(product, this);
        ingredients.getIngredients().add(node);
        if (this == product || parentCheck(product)) {
            return false;
        }
        return true;
    }

    private boolean parentCheck(Product product) {
        boolean res = false;
        for(Node node : ingredients.getIngredients()) {
            if (node.getParent().equals(product)) {
                return true;
            }
        }
        return res;
    }
}
