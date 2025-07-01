import java.util.* ; 
public class Graph {
    public class Edge{
        // Edge contain its source and destination
        int src ; 
        int dest ; 
        int weight ; 

        // Constructor of Edge Class 
        public Edge(int  src , int dest,int weight){
            this.src = src ; 
            this.dest = dest ; 
            this.weight = weight ; 
        }
    }

    // Implementation of Graph using Adjecent List 
    public void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<Edge>(); // to convert arraylist null to empty 
        }
        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    public static void main(String[] args) {
        Graph g = new Graph(); 
        int V = 4 ;  // where V is no of vertices/edge in graph 
        ArrayList<Edge> graph[] = new ArrayList[V];
        g.createGraph(graph);
        for(int i = 0 ; i<graph[2].size();i++){
            System.out.println(graph[2].get(i).dest);
        }

        System.out.print("Neibour of Edege 3 :- ");
        // print neibour of 3 
        for(int i = 0 ; i<graph[3].size();i++){
            Edge e = graph[3].get(i);
            System.out.print(e.dest+" ");
        }

        System.out.println("");
        // print neibour of 2 and weight of each dest 
        for(int i = 0 ; i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" "+e.weight);
        }
        
    }
}
