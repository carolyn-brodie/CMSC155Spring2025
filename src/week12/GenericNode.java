package week12;

public class GenericNode<T> {

    //attributes
    private T value;
    private GenericNode link;

    //constructor
    public GenericNode(T value) {
        this.value = value;
        link =null;
    }

    //other methods
    public void setLink(GenericNode newNode) {

        link = newNode;
    }


    public T getValue() {

        return value;
    }
    //return the node
    public GenericNode getLink() {

        return link;
    }

    //toString
    public String toString() {

        return "" + value;
    }


    public static void main(String[] args) {
        GenericNode<String> node1 = new GenericNode<>("How");
        GenericNode<String> node2 = new GenericNode<>("Now");
        GenericNode<String> node3 = new GenericNode<>("Brown");
        GenericNode<String> node4 = new GenericNode<>("Cow");
        node1.setLink(node2);
        node2.setLink(node3);
        node3.setLink(node4);

        GenericNode<String> currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode + " ");
            currentNode = currentNode.getLink();
        }
        System.out.println();

        GenericNode<Integer> node10 = new GenericNode<>(100);
        GenericNode<Integer> node20 = new GenericNode<>(200);
        node10.setLink(node20);

        GenericNode<Integer> currentNode2 = node10;
        while (currentNode2 != null) {
            System.out.print(currentNode2 + " ");
            currentNode2 = currentNode2.getLink();
        }

    }

}
