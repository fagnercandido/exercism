import java.util.stream.Collectors;
import java.util.stream.Stream;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = sanitize(phrase);
    }

    private String sanitize(String originalPhrase) {
        return originalPhrase.replace("-", " ").replace("_", "").replace("  ", " ");
    }

    String get() {
        Stream<String> words = Stream.of(phrase.split(" "));
        return (String) words
        .filter(word -> !word.equals(" ") && !word.equals(""))
        .map(word -> {
            return String.valueOf(word.charAt(0)).toUpperCase();
        })
        .collect(Collectors.joining());
    }
}
