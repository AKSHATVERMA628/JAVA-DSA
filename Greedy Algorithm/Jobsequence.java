import java.util.*;

public class Jobsequence {
    static class Job {// job ki class
        int deadline;
        int profit;
        int id;// O(A), 1(B), 2(C)

        public Job(int i, int d, int p) {// job ka constructor hai
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        // job ki information ko objects me convert kiya hai
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        // objects sort ho rahe hai yaha se
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);// descending order of profit
        // oor //Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit1);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("max job= " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
