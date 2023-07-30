public class Triple<A,B,C> {

    A team;
    B wins;
    C losses;

    public Triple(A first, B second, C third){

        team = first;
        wins = second;
        losses = third;

    }

    public A getFirst(){
        return team;
    }

    public B getSecond(){
        return wins;
    }

    public C getThird(){
        return losses;
    }

}