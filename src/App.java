import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();
        runArbolRecorridos();
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        // Insertar cada valor al árbol
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Imprimir el árbol binario
        arbolBinario.printTree();
    }

    public static void runArbolRecorridos() {
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

        // Recorrido en preorden recursivo
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