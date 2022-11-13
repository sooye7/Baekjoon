import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FashionKing {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            int headgear=0, eyewear=0, face=0;
            for(int j=0;j<num;j++){
                String[] str=br.readLine().split(" ");
                if(str[1].equals("headgear"))
                    headgear++;
                else if(str[1].equals("eyewear"))
                    eyewear++;
                else
                    face++;
            }
            int result=(headgear+1)*(eyewear+1)*(face+1)-1;  // 입지 않는 경우를 추가해줘야 하므로 +1, 모든 옷을 입지 않는 경우를 빼주기 -1
            System.out.println(result);

        }

    }
}
