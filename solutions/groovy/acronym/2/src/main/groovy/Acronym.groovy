class Acronym {

    static String abbreviate(String phrase) {
        String[] phrases = phrase.split(" ");
        def finishString = new StringBuilder();
        for (element in phrases) {
            def removeSigns = (element =~ /\p{L}/);
            def firstLetter = removeSigns.find() ? removeSigns.group() : null;
            finishString.append(firstLetter)
        }
        return finishString.toString().toUpperCase()
    }

}