package ExceptionalHandling.Vote;

public class NotEligibleForVote extends Throwable{
    @Override
    public String toString() {
        return "NotEligibleForVote";
    }
}
