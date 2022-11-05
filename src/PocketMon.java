import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PocketMon {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        Map<String, Integer> findByName=new HashMap<>();  // <name, id>
        Map<Integer, String> findById=new HashMap<>();  // <id, name>
        int id=1;

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            String name=br.readLine();
            findByName.put(name, id);
            findById.put(id, name);
            id++;
        }
        for(int i=0;i<M;i++){
            String input=br.readLine();
            // 숫자 들어온 경우
            if(Character.isDigit(input.charAt(0)))
                System.out.println(findById.get(Integer.parseInt(input)));
            // 이름 들어온 경우
            else
                System.out.println(findByName.get(input));
        }
    }
}
