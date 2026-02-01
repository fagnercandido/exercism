public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes){
        return this.preparationTimeInMinutes(layers) + minutes;
    }

}
