package main.Materia.Models;

public class Node {
    private int value;
    private int height;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.height = 1; // Altura inicial de un nodo
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
