import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittlePrince {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        for(int i=0;i<n1;i++){
            int count=0;
            // 출발점, 도착점
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());

            // 행성 배열
            int n2=Integer.parseInt(br.readLine());
            for(int j=0;j<n2;j++) {
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if(isInThePlanet(x1,y1,x,y,r)&&!isInThePlanet(x2,y2,x,y,r))
                    count++;
                else if(!isInThePlanet(x1,y1,x,y,r)&&isInThePlanet(x2,y2,x,y,r))
                    count++;
            }
            System.out.println(count);
        }
    }

    // 점이 행성 내부에 있는지 (어린왕자의 위치 px py, 원의 중점과 반지름 x y r)
    private static boolean isInThePlanet(int px, int py, int x, int y, int r){
        return Math.pow(px-x,2)+Math.pow(py-y,2)<Math.pow(r,2);
    }
}
