import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Stack {
    public static Queue<Integer> queue;
    public static void stackFunc(String order, int num){
        if(order.equals("push"))
            queue.add(num);
        else if(order.equals("pop"))
            System.out.println(queue.poll());
        else if(order.equals("top"))
            System.out.println(queue.peek());
        else if(order.equals("empty")){
            if(queue.isEmpty())
                System.out.println(1);
            else
                System.out.println(0);
        }
        else if(order.equals("size"))
            System.out.println(queue.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        queue=new LinkedList<>();
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine()," ");
            String order=st.nextToken();
            int num=0;
            if(st.hasMoreTokens())
                num=Integer.parseInt(st.nextToken());
            stackFunc(order, num);
        }
        st=new StringTokenizer(br.readLine(), " ");


    }
}
