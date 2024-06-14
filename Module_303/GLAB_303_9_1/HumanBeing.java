package HW_303_7_1.GLAB_303_9_1;

public class HumanBeing {
    private double weight;
    private double height;
    private double bmi;

    public HumanBeing() {
    }
    public HumanBeing(float weight, float height) {
        this.weight = weight;
        this.height = height;
        bmi = (weight / (height * height));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void calculateBmi() {
        bmi = (weight / (height * height));;
    }

    @Override
    public String toString() {
        return String.format("Weight in lbs %.2f and height in feet %.2f with bmi %.2f.", weight, (height/12), bmi);
    }
}
