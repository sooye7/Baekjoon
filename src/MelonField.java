import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonField {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] map=new int[5][2];  // 방향, 길이
        boolean[] dir=new boolean[5];
        int[] order=new int[2];
        int priorDir=0;
        int area1=1,area2=1;
        boolean check=false;
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int direction=Integer.parseInt(st.nextToken());
            int len=Integer.parseInt(st.nextToken());
            if(map[direction][0]!=0) {
                map[direction][1] = len;
                if(!check) {
                    order[0]=priorDir;
                    order[1]=direction;
                    check = true;
                }
            }
            else
                map[direction][0]=len;
            priorDir=direction;
        }
        // 전체너비
        for(int i=1;i<5;i++) {
            if (map[i][1] == 0)
                area1 *= map[i][0];
        }
        // 뺄너비
        if(order[0]==2&&order[1]==3)  // 뒤집힌 ㄴ 모양인 경우 (서, 남 연속으로 등장)
            area2=map[order[0]][1]*map[order[1]][1];
        else
            area2=map[order[0]][0]*map[order[1]][1];
        System.out.println((area1-area2)*n);
    }
}
