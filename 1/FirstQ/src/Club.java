class Club implements Comparable<Club> {
    String name;
    int rank;

    @Override
    public int compareTo(Club other) {
        return Integer.compare(this.rank, other.rank);
    }
}