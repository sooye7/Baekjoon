import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DifferentStringNums {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        Set<String> hs=new HashSet<>();
        for(int i=0;i<str.length();i++){
            int num=0;
            while(num+i<=str.length()){
                hs.add(str.substring(num,num+i));
                num++;
            }
        }
        System.out.println(hs.size());
    }
}
