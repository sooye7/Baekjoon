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
        boolean check=false;
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            sb.append(st.nextToken());  // 방향
            len[i]=Integer.parseInt(st.nextToken());
        }

        String order=String.valueOf(sb);
        if (order.contains("13")||order.contains("24")||order.contains("32")||order.contains("41"))
            check = true;
        // dirOrder가 존재하지 않는 경우 순서 바꿔줘야 함
        // 뺄 너비 부분의 방향(dirOrder)이 존재하도록 순서 변경f
        int index=0;
        while(!check) {
            StringBuilder s=sb.delete(0, 1);
            sb.append(s);
            if (order.contains("13")||order.contains("24")||order.contains("32")||order.contains("41"))
                check = true;
        }
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
