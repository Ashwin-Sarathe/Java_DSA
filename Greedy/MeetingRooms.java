
//If overlapping of meeting happens then false otherwise true (means a person can attend all meetings)

import java.util.*;
public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        // sorting using comparator
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0)
                continue;
            int start = intervals[i][0];
            int end = intervals[i - 1][1];
            if (end > start)
                return false;
        }
        return true;
    }
}