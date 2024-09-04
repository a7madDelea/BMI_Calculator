package BMI;

public class Person extends BMI {

    // Constroctor
    public Person(int age, int height, double weight) {
        super(age, height, weight);
    }

    // Methods
    @Override
    public void getBMIResult() {

        switch (getAge()) {
            case 2:
            case 3:
            case 4:
            case 5:
                results(14, 17, 19);
                break;

            case 6:
            case 7:
            case 8:
                results(14.5, 18, 20);
                break;

            case 9:
            case 10:
            case 11:
                results(15, 19, 22);
                break;

            case 12:
            case 13:
            case 14:
                results(16, 21, 24);
                break;

            case 15:
            case 16:
            case 17:
                results(17, 23, 26);
                break;

            default:
                if (getAge() >= 18 && getAge() <= 24) {
                    results(19, 25, 30);
                } else if (getAge() >= 25 && getAge() <= 34) {
                    results(20, 26, 31);
                } else if (getAge() >= 35 && getAge() <= 44) {
                    results(21, 27, 32);
                } else if (getAge() >= 45 && getAge() <= 54) {
                    results(22, 28, 33);
                } else if (getAge() >= 55) {
                    results(23, 29, 34);
                }
                break;

        }

    }

}
