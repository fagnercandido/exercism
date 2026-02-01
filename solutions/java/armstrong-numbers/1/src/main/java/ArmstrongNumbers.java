class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String convertedValue = String.valueOf(numberToCheck);
        
        int sizeValue = convertedValue.length();

        if(sizeValue == 1) {
            return true;
        }

        int sum = 0;
        for(int count = 0; count < sizeValue; count++) {
            int value = Integer.parseInt(String.valueOf(convertedValue.charAt(count)));
            sum = sum + (int)Math.pow(value,sizeValue);
        }

        return sum == numberToCheck;
    }

}
