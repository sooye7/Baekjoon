import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsHeap {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)>Math.abs(o2))
                    return 1;
                else if(Math.abs(o1)==Math.abs(o2)){
                    if(o1>o2)
                        return 1;
                    else
                        return -1;
                }
                else
                    return -1;
            }
        });

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0) {
                if(pq.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
            }
            else
                pq.offer(num);
        }
    }
}
