import java.util.*;

public class BreadthFirstSearch<V extends Comparable<V>> implements Search<V> {

    @Override
    public List<Vertex<V>> search(WeightedGraph<V> graph, Vertex<V> source, Vertex<V> destination) {
        List<Vertex<V>> visited = new ArrayList<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int currentLayerSize = queue.size();
            List<Vertex<V>> nextLayer = new ArrayList<>();

            for (int i = 0; i < currentLayerSize; i++) {
                Vertex<V> current = queue.poll();

                Map<Vertex<V>, Double> adjacentVertices = current.getAdjacentVertices();
                List<Vertex<V>> sortedAdjacentVertices = new ArrayList<>(adjacentVertices.keySet());
                sortedAdjacentVertices.sort(Comparator.comparing(adjacentVertices::get));

                for (Vertex<V> neighbor : sortedAdjacentVertices) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        nextLayer.add(neighbor);
                    }
                }
            }

            queue.addAll(nextLayer);
        }

        return visited;
    }
}