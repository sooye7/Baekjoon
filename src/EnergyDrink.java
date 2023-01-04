import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class EnergyDrink {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Double> drink=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++)
            drink.add(Double.parseDouble(st.nextToken()));
        Collections.sort(drink);

        while(drink.size()!=1){
            double d=drink.get(0)/2+drink.get(drink.size()-1);
            drink.set(drink.size()-1, d);
            drink.remove(0);
        }
        System.out.println(drink.get(0));
    }
}
