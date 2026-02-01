import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private Map<String, String> mapProtein = new LinkedHashMap<>(){{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
    }};

    private List<String> mapStopProtein = Arrays.asList("UAA", "UAG", "UGA");

    List<String> translate(String rnaSequence) {
        List<String> protein = new LinkedList<>();
        if(mapStopProtein.contains(rnaSequence)) {
            return Collections.EMPTY_LIST;
        }
        int sizeSub = 0;
        for(int part = 0; part < rnaSequence.length()/3; part++) {
            String amino = rnaSequence.substring(sizeSub, sizeSub+3);
            if(mapStopProtein.contains(amino)) {
                break;
            }
            protein.add(mapProtein.get(amino));
            sizeSub = sizeSub+3;
        }
        return protein;
    }
}
