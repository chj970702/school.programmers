public class Main {
    public static void main(String[] args) {
        Running sol = new Running();
        String [] players = {"mumu", "soe", "poe", "kai", "mine"};
        String [] callings = {"kai", "kai", "mine", "mine"};
        String[] ans = sol.solution(players, callings);
        for (String k : ans) {
            System.out.println(k);
        }
    }
}
