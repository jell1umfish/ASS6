import java.util.*;

public class WeightedGraph<V extends Comparable<V>> {
    private Map<Vertex<V>, List<Vertex<V>>> map;

    public WeightedGraph() {
        map = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        map.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        if (!map.containsKey(source) || !map.containsKey(destination)) {
            throw new IllegalArgumentException("Vertex is not found in the graph");
        }
        source.addAdjacentVertex(destination, weight);
        map.get(source).add(destination);
    }
}