package exceptionalhandling.vote;

public class NotEligibleForVote extends Throwable{
    @Override
    public String toString() {
        return "NotEligibleForVote";
    }
}
