public class Node {
    private Product product;
    private Product parent;

    public Node(Product product, Product parent) {
        this.product = product;
        this.parent = parent;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getParent() {
        return parent;
    }

    public void setParent(Product parent) {
        this.parent = parent;
    }
}