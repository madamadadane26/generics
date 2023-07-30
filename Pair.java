public class Pair<A,B> {

    A team;
    B stat;

    public Pair(A first, B second){

        team = first;
        stat = second;

    }

    public A getFirst(){
        return team;
    }

    public B getSecond(){
        return stat;
    }

}