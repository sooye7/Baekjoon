import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinKyumNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String minkyum=br.readLine();

        StringBuilder max=new StringBuilder();
        StringBuilder min=new StringBuilder();

        if(minkyum.contains("M")&&minkyum.contains("K")) {
            String[] mk=minkyum.split("K");

            // 최댓값
            for (String m : mk) {
                max.append("5");
                for (int i = 0; i < m.length(); i++)
                    max.append("0");
            }

            // 최솟값
            for (String m : mk) {
                if (!m.isEmpty())
                    min.append("1");
                for (int i = 0; i < m.length() - 1; i++)
                    min.append("0");
                min.append("5");
            }

            if (minkyum.charAt(minkyum.length() - 1) == 'M') {
                max.deleteCharAt(max.length() - 1);  // 마지막 0 1개 제거
                for(int i=max.lastIndexOf("5");i<max.length();i++)
                    max.replace(i,i+1,"1");
                min.deleteCharAt(min.length() - 1);  // 마지막 1 제거
            }
            else{
                for(int i=minkyum.length()-1;i>=0;i--){
                    if(minkyum.charAt(i)=='K'){
                        max.append("5");
                        min.append("5");
                    }
                    else
                        break;
                }
                max.deleteCharAt(max.length() - 1);
                min.deleteCharAt(min.length() - 1);
            }
        }
        else if(minkyum.contains("M")&&!minkyum.contains("K")){
            max.append("1");
            min.append("1");
            for(int i=0;i<minkyum.length()-1;i++) {
                max.append("1");
                min.append("0");
            }
        }
        else {  // K만 있을 때
            for(int i=0;i<minkyum.length();i++){
                max.append("5");
                min.append("5");
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
