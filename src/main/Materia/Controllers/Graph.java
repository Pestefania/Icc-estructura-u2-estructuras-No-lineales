package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;


import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    // Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo
    public NodeG addNode(int value) {
        NodeG nodeG = new NodeG(value);
        nodes.add(nodeG);
        return nodeG;
    }

    //Metodo para añadir una arista
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    //Metodo para imprimir el grafo
    public void printGraph() {
        for (NodeG nodeG : nodes) {
            System.out.print("Vertice " + nodeG.getValue() + ": ");
            for (NodeG neighbor : nodeG.getNeighbors()) {
                System.out.print(neighbor.getValue() + " - ");
            }
            System.out.println();
        }
    }
}
