class Leap {

    boolean isLeapYear(int year) {
        boolean isMultiple4 = year % 4 == 0;
        boolean isMultiple100 = year % 100 == 0;
        boolean isMultiple400 = year % 400 == 0;
        
        if(!isMultiple4) {
            return false;
        }
        if(isMultiple100) {
            if(isMultiple400) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

}
