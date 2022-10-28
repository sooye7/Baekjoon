import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Build {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Size[] s=new Size[N];
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            s[i]=new Size(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        // 덩치 비교, 등수 출력
        for(int i=0;i<N;i++){
            int rank=1;
            for(int j=0;j<N;j++){
                if(s[i].getHeight()<s[j].getHeight()&&s[i].getWeight()<s[j].getWeight())
                    rank++;
            }
            System.out.print(rank+" ");
        }
    }
}

class Size{
    private int height;  // 키
    private int weight;  // 몸무게
    public Size(int height, int weight){
        this.height=height;
        this.weight=weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
