import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColor {

    private Map<String, Integer> mapResistor = new LinkedHashMap<>(){{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};

    int colorCode(String color) {
        return mapResistor.get(color);
    }

    String[] colors() {
        return (String[]) mapResistor.keySet().toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(new ResistorColor().colors());
    }

}
