import java.util.* ;
public class GraphBFS {
    public class Edege{
        int src ; 
        int dest ; 
        public Edege(int src , int dest){
            this.src = src ; 
            this.dest = dest  ;
        }
    }

    // create graph 
    public void createGraph(ArrayList<Edege>graph[]){
        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<Edege>();
        }

        graph[0].add(new Edege(0, 1));
        graph[0].add(new Edege(0, 2));

        graph[1].add(new Edege(1, 0));
        graph[1].add(new Edege(1, 3));

        graph[2].add(new Edege(2, 0));
        graph[2].add(new Edege(2, 4));

        graph[3].add(new Edege(3, 1));
        graph[3].add(new Edege(3, 4));
        graph[3].add(new Edege(3, 5));

        graph[4].add(new Edege(4, 2));
        graph[4].add(new Edege(4, 3));
        graph[4].add(new Edege(4, 5));

        graph[5].add(new Edege(5, 3));
        graph[5].add(new Edege(5, 4));
        graph[5].add(new Edege(5, 6));

        graph[6].add(new Edege(6, 5));

    }

    // bfs -> breath first search (indirect level by level traversal)
    public void bfs(ArrayList<Edege> []graph,int v){
        Queue<Integer> queue = new LinkedList<>(); 
        boolean vis[] = new boolean[v];
        queue.add(0);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr] = true ; 

                for(int i = 0 ; i<graph[curr].size();i++){
                    Edege e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(); 
        int K = 7 ; 
        ArrayList<Edege> graph[] = new ArrayList[K];
        g.createGraph(graph);
        for(int i = 0 ; i<graph[3].size();i++){
            Edege e = graph[3].get(i);
            System.out.println(e.src+" "+e.dest);
        }

        g.bfs(graph, K);
    }
}
