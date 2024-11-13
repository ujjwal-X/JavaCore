package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<String> w = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        Optional<String> LongestString=w.stream().reduce((w1, w2)->(w1.length()>w2.length()?w1:w2));
        System.out.println(LongestString);


    }
}
