import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F){

    ArrayList<Integer> ans = new ArrayList<>();
    int a[][] = new int[N][3];
        for(int i=0;i<N;i++)

    {
        a[i][0] = i + 1;
        a[i][1] = S[i];
        a[i][2] = F[i];
    }
        Arrays.sort(a, new Comparator<int[]>(){
            public int compare(int[] m1, int[] m2){
                return Integer.compare(m1[2],m2[2]);
            }
        });
    int r = a[0][2];
        ans.add(a[0][0]);
        for(int i=1;i<a.length;i++)

    {
        if (a[i][1] > r) {
            ans.add(a[i][0]);
            r = a[i][2];
        }
    }
        Collections.sort(ans);
        return ans;
}

}
