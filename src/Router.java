import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Router {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        while(true){
            int num=Integer.parseInt(br.readLine());
            if(num==-1)
                break;
            if(queue.size()==n&&num!=0){
                continue;
            }
            else {
                if (num == 0)
                    queue.poll();
                else
                    queue.offer(num);
            }

        }

        if(queue.isEmpty())
            System.out.println("empty");
        else
            for(int q:queue)
                System.out.print(q+" ");
    }
}
