class SpaceAge {

    private double seconds;
    private double yearInSecondsInEarth = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds/yearInSecondsInEarth;
    }

    double onMercury() {
        final double mercuryEarthYears = 0.2408467;
        double yearInSecondsMercury = mercuryEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsMercury;
    }

    double onVenus() {
        final double venusEarthYears = 0.61519726;
        double yearInSecondsVenus = venusEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsVenus;
    }

    double onMars() {
        final double marsEarthYears = 1.8808158;
        double yearInSecondsMars = marsEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsMars;
    }

    double onJupiter() {
        final double jupiterEarthYears = 11.862615;
        double yearInSecondsJupiter = jupiterEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsJupiter;
    }

    double onSaturn() {
        final double saturnEarthYears = 29.447498;
        double yearInSecondsSaturn = saturnEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsSaturn;
    }

    double onUranus() {
        final double uranusEarthYears = 84.016846;
        double yearInSecondsUranus = uranusEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsUranus;
    }

    double onNeptune() {
        final double neptuneEarthYears = 164.79132;
        double yearInSecondsNeptune = neptuneEarthYears*yearInSecondsInEarth;
        return this.seconds/yearInSecondsNeptune;
    }

}
