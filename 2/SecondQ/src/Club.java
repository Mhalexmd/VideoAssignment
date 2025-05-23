import java.util.Objects;

class Club {
    String name;
    int rank;

    @Override
    public boolean equals(Object o) {
        Club club = (Club) o;
        return rank == club.rank && Objects.equals(name, club.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank);
    }
}