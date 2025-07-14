import java.util.*;

public class KosarajuAlgo {
    class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[3].add(new Edge(3, 4));
    }

    // Modified DFS to collect SCC nodes
    public void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, List<Integer> scc) {
        vis[curr] = true;
        scc.add(curr);
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, scc);
            }
        }
    }

    public void TopSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                TopSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public void kosarajuAlgorithms(ArrayList<Edge>[] graph, int V) {
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];

        // Step 1: Topological sort
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                TopSort(graph, i, vis, s);
            }
        }

        // Step 2: Transpose the graph
        ArrayList<Edge>[] transposeGraph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transposeGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                transposeGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: DFS on transposed graph to find SCCs
        Arrays.fill(vis, false);
        System.out.println("Strongly Connected Components:");
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                List<Integer> scc = new ArrayList<>();
                dfs(transposeGraph, curr, vis, scc);
                System.out.println(scc);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        KosarajuAlgo k = new KosarajuAlgo();
        k.createGraph(graph);
        k.kosarajuAlgorithms(graph, V);
    }
}
