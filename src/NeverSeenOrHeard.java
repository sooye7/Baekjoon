import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NeverSeenOrHeard {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        Set<String> hs=new HashSet<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<N;i++)
            hs.add(br.readLine());
        for(int i=0;i<M;i++){
            String name=br.readLine();
            if(hs.contains(name))
                list.add(name);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list.size());
        for(String name:list)
            System.out.println(name);


    }
}
