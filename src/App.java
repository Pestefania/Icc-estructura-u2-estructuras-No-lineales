import java.util.List;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) {
        // Llamar a los métodos que deseas ejecutar
        runArbolAVL();
        runArbolBinario();
        runArbolRecorridos();
        runEjercicio3();
    }

    private static void runArbolAVL() {
        ArbolAVL arbol = new ArbolAVL();

        // Insertar valores en el árbol AVL
        int[] valores = {10, 20, 30, 40, 50, 25};
        for (int valor : valores) {
            arbol.insert(valor);
        }

        // Imprimir el árbol AVL
        System.out.println("Arbol AVL:");
        arbol.printTree();
        System.out.println();
    }

    private static void runEjercicio3() {
        // Construir el árbol del ejemplo
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        // Imprimir el árbol como "Input"
        System.out.println("Input:");
        printTreeLevels(root);

        // Crear instancia de ListLevels y obtener los niveles
        ListLevels levels = new ListLevels();
        List<List<Node>> result = levels.listLevels(root);

        // Imprimir el resultado en el formato deseado
        System.out.println("\nOutput:");
        for (int i = 0; i < result.size(); i++) {
            List<Node> level = result.get(i);
            for (int j = 0; j < level.size(); j++) {
                System.out.print(level.get(j).getValue());
                if (j < level.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    // Método para imprimir el árbol como en la entrada
    private static void printTreeLevels(Node root) {
        if (root == null) return;

        ListLevels levels = new ListLevels();
        List<List<Node>> result = levels.listLevels(root);

        for (int i = 0; i < result.size(); i++) {
            List<Node> level = result.get(i);

            // Imprimir nodos en la misma línea
            for (int j = 0; j < level.size(); j++) {
                System.out.print(level.get(j).getValue());
                if (j < level.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea al final de cada nivel
        }
    }

    private static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        // Insertar cada valor al árbol binario
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Imprimir el árbol binario
        System.out.println("Recorrido en orden del árbol binario:");
        arbolBinario.printTree();
        System.out.println();
    }

    private static void runArbolRecorridos() {
        ArbolBinario arbolBinario = new ArbolBinario(); // Usar ArbolBinario para insertar valores
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        // Insertar valores al árbol binario
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Crear instancia de ArbolRecorridos
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        // Realizar recorridos en el árbol
        System.out.println("Recorrido en preOrden (iterativo):");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());

        System.out.println("Recorrido en preOrden (recursivo):");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println();

        System.out.println("Recorrido en posOrder:");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
        System.out.println();

        System.out.println("Recorrido en inOrden:");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
    }
}
