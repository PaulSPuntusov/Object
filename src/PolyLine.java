import java.util.Arrays;
import java.util.Objects;

public class PolyLine {
    Dot[] dots;

    public PolyLine(Dot... dots) {
        this.dots = dots;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 1; i < dots.length - 1; i++) {
            len1 = dots[i].x - dots[i - 1].x;
            len2 = dots[i].y - dots[i - 1].y;
            sum += Math.sqrt((len1 * len1) + (len2 * len2));
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolyLine)) return false;
        PolyLine polyLine = (PolyLine) o;
        for (int i = 0; i < dots.length; i++) {
            if (!(Objects.equals(dots[i], polyLine.dots[i]))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dots);
    }
}
