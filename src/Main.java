public class Main {
    public static void main(String[] args) {
        FWS sol = new FWS();
        int [] schedules = {730, 855, 700, 720};
        int [][] timelogs = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};
        int startday = 7;
        int ans = sol.solution(schedules, timelogs, startday);
        System.out.println(ans);
    }
}
