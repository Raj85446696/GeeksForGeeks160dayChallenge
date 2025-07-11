import java.util.*;

public class GraphAlgo {

    class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public void dijkstra(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        boolean[] vis = new boolean[V];
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int u = curr.node;

            if (!vis[u]) {
                vis[u] = true;

                for (int i = 0; i < graph[u].size(); i++) {
                    Edge e = graph[u].get(i);
                    int v = e.dest;
                    int w = e.weight;

                    if (dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // Print result
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from node " + src + " to " + i + " is " + dist[i]);
        }
    }

    public void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 1));  // changed from -1 to 1

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, 1));  // changed from -1 to 1
    }

    public static void main(String[] args) {
        GraphAlgo g = new GraphAlgo();
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        g.createGraph(graph);
        g.dijkstra(graph, 0, V);
    }
}
