import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Vocabulary {
    private final List<String> vocabulary = new ArrayList<>();
    private final Function function = (x) -> x.split(" ");

    public List<String> getVocabulary() {
        return vocabulary.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public void addWords(String msg) {
        vocabulary.addAll(Arrays.stream(function.split(msg)).toList());
    }
}