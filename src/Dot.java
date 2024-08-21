import java.util.Objects;

public class Dot {
    int x,y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dot)) return false;
        Dot dot = (Dot) o;
        return x == dot.x && y == dot.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public Dot clone(){
        int x,y;
        x = this.x;
        y = this.y;
        return new Dot(x,y);
    }

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
