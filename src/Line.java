import java.util.Objects;

public class Line {
    Dot start, end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
    public Line clone(){
        int x1,x2,y1,y2;
        x1 =  start.x;
        x2 =  end.x;
        y1 =  start.y;
        y2 =  end.y;
        return new Line(new Dot(x1,y1),new Dot(x2,y2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
