import java.util.ArrayList;
public class Generics_Test {

    public static void main(String[] args){

        Triple<String, Integer, Integer> oTeam1 = new Triple<>("Team 1", 5, 15);
        Triple<String, Integer, Integer> oTeam2 = new Triple<>("Team 2", 10, 10);
        Triple<String, Integer, Integer> oTeam3 = new Triple<>("Team 3", 16, 4);
        Triple<String, Integer, Integer> oTeam4 = new Triple<>("Team 4", 19, 1);
        Triple<String, Integer, Integer> oTeam5 = new Triple<>("Team 5", 13, 7);

        Triple<String,Integer,Integer>[] aoTriple = new Triple[5];
        aoTriple[0] = oTeam1;
        aoTriple[1] = oTeam2;
        aoTriple[2] = oTeam3;
        aoTriple[3] = oTeam4;
        aoTriple[4] = oTeam5;

        Pair<String,Double>[] aoPair = new Pair[5];

        for(int x =0;  x < aoTriple.length; x++){

            String iTeam =   aoTriple[x].getFirst();
            double iWins =  aoTriple[x].getSecond();
            double iLosses = aoTriple[x].getThird();
            double iStats = (iWins / (iWins + iLosses));

            Pair<String,Double> oTempPair = new Pair<>(iTeam, iStats);
            aoPair[x] = oTempPair;
            oTempPair = null;

        }

        double highestWinningPerc = 0.0;
        String sHighestTeamWin = "";

        for(int  x =0; x  < aoPair.length; x ++){
            if (highestWinningPerc < aoPair[x].getSecond()){
                highestWinningPerc = aoPair[x].getSecond();
                sHighestTeamWin = aoPair[x].getFirst();
            }
            System.out.println(aoPair[x].getFirst() + ": " + (aoPair[x].getSecond() * 100) + "%");
        }
        System.out.println("The winning Team is: " + sHighestTeamWin + " and they have the highest winning percentage!");

    }

}