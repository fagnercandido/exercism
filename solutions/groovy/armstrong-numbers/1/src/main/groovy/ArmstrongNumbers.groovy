class ArmstrongNumber {

    static isArmstrongNumber(number) {
        def numberInString = number.toString()
        def size = numberInString.size()
        return number.toInteger() == numberInString.collect { (it as String).toInteger() ** size }.sum()
    }
}