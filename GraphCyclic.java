import java.util.*;

class Graph2 {
    class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // 0 , 1
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // To check whether graph is cyclic or not 
    public boolean isCyclic(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCyclic(graph, vis, e.dest, rec))
                    return true;
            }
        }
        rec[curr] = false;
        return false;
    }


    // topological sorting 
    public void helperTopSort(ArrayList<Edge>[] graph , int curr , boolean[] vis , Stack<Integer> stack){
        vis[curr] = true ; 
        for(int i = 0 ; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[curr]){
                helperTopSort(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public void TopSort(ArrayList<Edge> graph[],int V){
        boolean ans[] = new boolean[V];
        Stack<Integer> stack = new Stack<>(); 
        for(int i = 0 ; i<V ;i++){
            if(!ans[i]){
                helperTopSort(graph, i, ans, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Graph2 g1 = new Graph2();
        int V = 6;
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        g1.createGraph(graph);
        boolean cycle = false;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (g1.isCyclic(graph, vis, i, rec)) {
                    cycle = true;
                    break;
                }
            }
        }
        System.out.println(cycle);


        g1.TopSort(graph, V);
    }
}