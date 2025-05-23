import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Club a = new Club(); a.name = "a"; a.rank = 1;
        Club b = new Club(); b.name = "a"; b.rank = 1;

        HashSet<Club> hashset = new HashSet<>();
        hashset.add(a);
        hashset.add(b);

        Iterator<Club> it = hashset.iterator();
        while (it.hasNext()) {
            Club c = it.next();
            System.out.println(c.name);
        }
    }
}