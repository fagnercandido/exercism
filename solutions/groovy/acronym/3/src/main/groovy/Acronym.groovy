class Acronym {

    static String abbreviate(String phrase) {
        String[] phrases = phrase.split(" ");
        def finishString = new StringBuilder();
        for (element in phrases) {
            String[] hasSlash = element.split("-")
            if (hasSlash.length > 1) { 
                for (item in hasSlash) {
                    def removeSignsInItem = (item =~ /\p{L}/);
                    def firstLetterInSign = removeSignsInItem.find() ? removeSignsInItem.group() : null;
                    if(firstLetterInSign != null) {
                        finishString.append(firstLetterInSign);
                    }
                }
            } else {
                def removeSigns = (element =~ /\p{L}/);
                def firstLetter = removeSigns.find() ? removeSigns.group() : null;
                if(firstLetter != null) {
                    finishString.append(firstLetter);
                }
            }
        }
        return finishString.toString().toUpperCase();
    }

}