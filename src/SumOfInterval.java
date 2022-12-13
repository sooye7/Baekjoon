import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfInterval {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[][] map=new int[n][n];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine()," ");
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int sum=0;
            for(int j=x1-1;j<=x2-1;j++){
                for(int k=y1-1;k<=y2-1;k++){
                    sum+=map[j][k];
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
