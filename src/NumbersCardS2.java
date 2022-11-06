import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumbersCardS2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        StringBuilder sb=new StringBuilder();
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<N;i++) {
            String key=st.nextToken();
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++) {
            String key=st.nextToken();
            sb.append(map.getOrDefault(key, 0) + " ");
        }
        System.out.println(sb);
    }
}
