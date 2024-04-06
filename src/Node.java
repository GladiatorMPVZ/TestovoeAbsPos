public class Node {
    private Product product;
    private Product parent;

    public Node(Product product, Product parent) {
        this.product = product;
        this.parent = parent;
    }

    public Product getParent() {
        return parent;
    }
}