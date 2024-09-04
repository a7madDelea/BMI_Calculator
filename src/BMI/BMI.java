package BMI;

public abstract class BMI {

    // Variables.
    private int age;
    private int height;
    private double weight;

    // Constroctor.
    public BMI(int age, int height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Setters methods.

    // Age setter method.
    public void setAge(int age) {
        this.age = age;
    }

    // Height setter method.
    public void setHeight(int height) {
        this.height = height;
    }

    // Weight setter method.
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getters methods.

    // Age getter method.
    public int getAge() {
        return this.age;
    }

    // Height getter method.
    public int getHeight() {
        return this.height;
    }

    // Weight getter method.
    public double getWeight() {
        return this.weight;
    }

    // BMI result method
    public abstract void getBMIResult();

    // BMI calculator method
    protected void results(double first, double second, double third) {
        double bmi = getWeight() / Math.pow(getHeight() / 100.0, 2);
        if (bmi < first) {
            System.out.printf("BMI result: %.1f, (Underweight)\n", bmi);
        } else if (bmi >= first && bmi < second) {
            System.out.printf("BMI result: %.1f, (Normal Weight)\n", bmi);
        } else if (bmi >= second && bmi <= third) {
            System.out.printf("BMI result: %.1f, (Overweight)\n", bmi);
        } else {
            System.out.printf("BMI result: %.1f, (Obese)\n", bmi);
        }
    }

}
