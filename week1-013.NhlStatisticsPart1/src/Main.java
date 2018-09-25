
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top ten by penalty points");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("glyers");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
