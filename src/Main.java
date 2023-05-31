import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<Integer> graph = new WeightedGraph<>();

        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);
        Vertex<Integer> vertex5 = new Vertex<>(5);
        Vertex<Integer> vertex6 = new Vertex<>(6);
        Vertex<Integer> vertex7 = new Vertex<>(7);

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);
        graph.addVertex(vertex5);
        graph.addVertex(vertex6);
        graph.addVertex(vertex7);

        graph.addEdge(vertex1, vertex2, 3);
        graph.addEdge(vertex1, vertex3, 6);
        graph.addEdge(vertex2, vertex4, 2);
        graph.addEdge(vertex2, vertex5, 4);
        graph.addEdge(vertex3, vertex6, 1);
        graph.addEdge(vertex3, vertex7, 4);

        Search<Integer> bfsSearch = new BreadthFirstSearch<>();
        List<Vertex<Integer>> bfsPath = bfsSearch.search(graph, vertex1, vertex7);
        System.out.println("BFS Path: " + bfsPath);

        Search<Integer> dijkstraSearch = new DijkstraSearch<>();
        List<Vertex<Integer>> dijkstraPath = dijkstraSearch.search(graph, vertex1, vertex7);
        System.out.println("Dijkstra Path: " + dijkstraPath);
    }
}