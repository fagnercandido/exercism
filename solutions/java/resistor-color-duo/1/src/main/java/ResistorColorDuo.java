import static java.lang.Integer.parseInt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {

    Map<String, Integer> mapColors = new HashMap<String, Integer>() {
        {
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
        }
    };

    int value(String[] colors) {
        String[] firstTwoColors = Arrays.copyOfRange(colors, 0, 2);
        StringBuilder numbers = new StringBuilder();
        for (String color : firstTwoColors) {
            numbers.append(mapColors.get(color));
        }
        System.out.println(numbers);
        return Integer.parseInt(numbers.toString());
    }

    public static void main(String[] args) {
        ResistorColorDuo rcd = new ResistorColorDuo();
        System.out.println(rcd.value(new String[]{"black", "black"}));
    }
}
