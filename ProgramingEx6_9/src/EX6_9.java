public class EX6_9 {

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet   Meters   |   Meters   Feet");
        System.out.println("--------------------------------");

        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = footToMeter(feet);
            double metersRange = 15.0 + (feet * 5);
            double feetFromMeters = meterToFoot(metersRange);


            System.out.print(feet + "  ");
            System.out.print(meters + "  ");

            System.out.print("|   ");

            System.out.print(metersRange + "  ");
            System.out.println(feetFromMeters);
        }
    }
}