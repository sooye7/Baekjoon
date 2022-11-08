import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonField2 {
    private static String[] dirOrder={"13","24","32","41"}; // ㄱ, ㄴ, 뒤집힌 ㄴ, 뒤집힌 ㄱ
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        int[] len=new int[6];
        int area1=1,area2=0;
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            sb.append(st.nextToken());  // 방향
            len[i]=Integer.parseInt(st.nextToken());
        }
        String order=String.valueOf(sb);
        for(int i=0;i<4;i++){
            if(order.contains(dirOrder[i])){
                // 전체 너비
                for(int j=0;j<order.length();j++){
                    if(order.charAt(j)!=dirOrder[i].charAt(0)&&order.charAt(j)!=dirOrder[i].charAt(1))
                        area1 *= len[j];
                }
                // 뺄 너비
                int a=len[order.indexOf(dirOrder[i])];
                int b=len[order.indexOf(dirOrder[i])+1];
                area2=a*b;
                break;
            }
        }
        System.out.println((area1-area2)*n);
    }
}
