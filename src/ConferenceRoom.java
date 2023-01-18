import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConferenceRoom {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<TimeTable> timeList = new ArrayList<>();
        List<TimeTable> timeTableList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            timeList.add(new TimeTable(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        timeList.sort(new Comparator<TimeTable>() {
            @Override
            public int compare(TimeTable o1, TimeTable o2) {
                return (o1.end - o1.start) - (o2.end - o2.start);
            }
        });
        int max=0;
        for (int k=0;k<n;k++) {
            timeTableList.clear();
            timeTableList.add(timeList.get(k));
            for (int i = k; i < n; i++) {
                TimeTable t=timeList.get(i);
                int tSize = timeTableList.size();
                boolean check = false;
                for(int j=0;j<tSize;j++){
                    TimeTable tl=timeTableList.get(j);
                    // 겹치는 시간 확인
                    if (t.start >= tl.start && t.end <= tl.end || t.start >= tl.start && t.start < tl.end
                            || t.end > tl.start && t.end <= tl.end || t.start <= tl.start && t.end >= tl.end){
                        check=true;
                        break;
                    }
                }
                if (!check)
                    timeTableList.add(t);
            }
            max=Math.max(max, timeTableList.size());
        }

        System.out.println(max);
    }
}

class TimeTable {
    public int start;
    public int end;

    public TimeTable(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString(){
        return start+" "+end;
    }


}
