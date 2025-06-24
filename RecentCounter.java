import java.util.*; 
class RecentCounter{
    Queue<Integer> queue ; 
    public RecentCounter(){
        queue = new LinkedList<>(); 
    }

    public int pint(int t){
        queue.add(t);
        while(!queue.isEmpty()&&t-3000>queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args) {
        RecentCounter t = new RecentCounter(); 
        System.out.println(t.pint(12));
    }
}