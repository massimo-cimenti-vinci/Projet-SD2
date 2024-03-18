import java.util.Objects;

public class Road {

    private int source, destination;

    public Road(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return Objects.equals(source, road.source) && Objects.equals(destination, road.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination);
    }

}
