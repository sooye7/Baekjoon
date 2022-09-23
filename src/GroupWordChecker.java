import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker {

    public static void main(String[] args) throws IOException {
        // 문자 공백으로 변경
        // 앞부분 trim을 했는데 가운데에 공백이 끼어있다면 그룹 아님 replaceFirst
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<n;i++){
            String s=br.readLine();
            while(!s.isEmpty()){
                String c=String.valueOf(s.charAt(0));
                s=s.replaceAll(c," ");
                s=s.stripLeading();  // 문자열 앞 공백 제거
                if(s.contains(" ")){
                    break;
                }
            }
            if(s.isEmpty())
                count++;
        }
        System.out.println(count);

    }
}
