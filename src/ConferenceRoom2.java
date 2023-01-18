import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.*;

public class ConferenceRoom2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<TimeTable> timeList = new ArrayList<>();
        int count=0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            timeList.add(new TimeTable(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        timeList.sort(new Comparator<TimeTable>() {
            @Override
            public int compare(TimeTable o1, TimeTable o2) {
                if(o1.end==o2.end)
                    return o1.start-o2.start;
                return o1.end-o2.end;  // 종료 시간 기준 정렬
            }
        });
        int prev=0;
        for(TimeTable t:timeList){
            if(prev<=t.start) {
                prev = t.end;
                count++;
            }
        }
        System.out.println(count);
    }
}

class TimeTable2 {
    public int start;
    public int end;

    public TimeTable2(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString(){
        return start+" "+end;
    }


}
