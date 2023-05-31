import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices; // with weights

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);

    }
    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }
}