import java.util.*;

public class WeightedGraph<V extends Comparable<V>> {
    private Map<Vertex<V>, List<Vertex<V>>> map;

    public WeightedGraph() {
        map = new HashMap<>();
    }
}