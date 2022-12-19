import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NGF {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int[] arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        // Hashmap에 개수와 함께 저장
        // key로 검색하면서 개수가 더 큰 것이 나오면 break 하면서 출력
        // 끝까지 검색하는데 개수가 더 큰 것이 없으면 -1
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            arr[i]=num;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<n;i++){
            int num=arr[i];
            int answer=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]!=num&&map.get(num)<map.get(arr[j])) {
                    answer = arr[j];
                    break;
                }
            }
            sb.append(answer).append(" ");
        }
        System.out.println(sb);
    }
}
