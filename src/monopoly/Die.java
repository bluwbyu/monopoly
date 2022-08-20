package monopoly;

public class Die {
    private int faceValue;

    public int roll() {
        faceValue = (int) (Math.random() * 6) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
