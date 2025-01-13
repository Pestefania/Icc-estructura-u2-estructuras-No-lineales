
package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolAVL {

    private Node root;

    // Método para insertar un valor en el árbol
    public void insert(int value) {
        System.out.println("\nNodo a insertar: " + value);
        root = insert(root, value);
    }

    // Método para insertar un nodo en el árbol AVL y mantener el equilibrio
    private Node insert(Node nodo, int value) {
        if (nodo == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            return newNode;
        }

        if (value < nodo.getValue()) {
            nodo.setLeft(insert(nodo.getLeft(), value));
        } else if (value > nodo.getValue()) {
            nodo.setRight(insert(nodo.getRight(), value));
        } else {
            return nodo; // No se permiten valores duplicados
        }

        // Actualizar altura del nodo
        nodo.setHeight(1 + Math.max(height(nodo.getLeft()), height(nodo.getRight())));

        // Obtener el balance o factor de equilibrio
        int balance = getBalance(nodo);

        // Mensajes de depuración para balance y altura
        System.out.println("Nodo actual: " + nodo.getValue() + ", Altura: " + nodo.getHeight());
        System.out.println("Equilibrio del nodo " + nodo.getValue() + " es " + balance);

        // Rotaciones para equilibrar el árbol
        if (balance > 1 && value < nodo.getLeft().getValue()) {
            System.out.println("Rotación Derecha en nodo: " + nodo.getValue() + ", Balance: " + balance);
            return rightRotate(nodo);
        }

        if (balance < -1 && value > nodo.getRight().getValue()) {
            System.out.println("Rotación Izquierda en nodo: " + nodo.getValue() + ", Balance: " + balance);
            return leftRotate(nodo);
        }

        if (balance > 1 && value > nodo.getLeft().getValue()) {
            System.out.println("Equilibrio del nodo " + nodo.getValue() + " indica Rotación Izq-Der");
            nodo.setLeft(leftRotate(nodo.getLeft()));
            return rightRotate(nodo);
        }

        if (balance < -1 && value < nodo.getRight().getValue()) {
            System.out.println("Equilibrio del nodo " + nodo.getValue() + " indica Rotación Der-Izq");
            nodo.setRight(rightRotate(nodo.getRight()));
            return leftRotate(nodo);
        }

        return nodo;
    }

    // Método para realizar una rotación hacia la derecha
    private Node rightRotate(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        // Realizar la rotación
        x.setRight(y);
        y.setLeft(T2);

        // Actualizar las alturas
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);

        System.out.println("Nueva raíz después de rotación derecha: " + x.getValue());
        return x;
    }

    // Método para realizar una rotación hacia la izquierda
    private Node leftRotate(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        // Realizar la rotación
        y.setLeft(x);
        x.setRight(T2);

        // Actualizar las alturas
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);

        System.out.println("Nueva raíz después de rotación izquierda: " + y.getValue());
        return y;
    }

    // Obtener la altura de un nodo
    private int height(Node node) {
        return (node == null) ? 0 : node.getHeight();
    }

    // Obtener el factor de equilibrio de un nodo
    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.getLeft()) - height(node.getRight());
    }

    // Método para imprimir el árbol AVL con nulos
    public void printTree() {
        printTree(root, "", false);
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getValue());
            printTree(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        } else {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + "null");
        }
    }

    // Método para recorrido en orden (in-order)
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    // Método para obtener la raíz del árbol
    public Node getRoot() {
        return root;
    }
}
