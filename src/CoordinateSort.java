import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoordinateSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        List<Point> list=new ArrayList<>();

        PriorityQueue<Point> pq=new PriorityQueue<>();
        // 리스트 정렬
//        for(int i=0;i<N;i++){
//            StringTokenizer st=new StringTokenizer(br.readLine()," ");
//            list.add(new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
//            //pq.offer(new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
//        }
////        for(Point p:pq)
////            System.out.println(p.getX()+" "+p.getY());
////
//        list.sort(new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                if(o1.getX()==o2.getX())
//                    return o1.getY()-o2.getY();
//                return o1.getX()-o2.getX();
//            }
//        });
//        for(Point p:list)
//            System.out.println(p.getX()+" "+p.getY());

        // 우선순위 큐 : 우선순위가 높은 데이터가 먼저 나감
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            pq.offer(new Point(x,y));
        }
        while(!pq.isEmpty()) {
            Point p=pq.poll();
            System.out.println(p.getX() + " " + p.getY());
        }

        //solution(N);
    }

}

class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
    @Override
    public int compareTo(Point o) {
        if(this.x==o.getX())
            return this.y-o.getY();
        return this.x-o.getX();
    }
}
