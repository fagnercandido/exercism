import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    private final Map<String, String> mapDNA = new HashMap<>(){{
        put("G", "C");
        put("C", "G");
        put("T", "A");
        put("A", "U");
    }};

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        for(int count = 0; count < dnaStrand.length(); count++) {
            result.append(mapDNA.get(String.valueOf(dnaStrand.charAt(count))));
        }
        return result.toString();
    }

}
