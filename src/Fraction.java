import java.util.Objects;

public class Fraction {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", denum=" + denum +
                '}';
    }

    @Override
    public boolean equals(Object fr) {
        if (this == fr) return true;
        if (fr == null || getClass() != fr.getClass()) return false;
        Fraction fraction = (Fraction) fr;
        return Objects.equals(num,fraction.num) && Objects.equals(denum, fraction.denum);
    }
}
