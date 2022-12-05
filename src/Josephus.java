import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        Queue<Integer> queue=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=n;i++)
            queue.offer(i);

        sb.append("<");
        while(!queue.isEmpty()){
            int i=1;
            while(i<k) {
                queue.offer(queue.poll());
                i++;
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.replace(sb.length()-2,sb.length(),">");
        System.out.println(sb);
    }
}
