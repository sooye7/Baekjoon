import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordSort {
    public static String[] sorting(String[] arr){
        Set<String> set=new HashSet<>(Arrays.asList(arr));
        Iterator<String> it=set.iterator();
        String[] strArr=new String[set.size()];
        int i=0;
        while(it.hasNext()){
            strArr[i]=it.next();
            i++;
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                return o1.length()-o2.length();
            }
        });
        return strArr;
    }



    public static void main(String[] args)  throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        String[] arr=new String[num];
        for(int i=0;i<num;i++)
            arr[i]=br.readLine();

        String[] answer=sorting(arr);

        for(String a:answer)
            System.out.println(a);
    }
}
