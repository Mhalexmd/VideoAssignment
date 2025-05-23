import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Club> clubs = new ArrayList<Club>();

        Club c;
        c = new Club(); c.name = "z"; c.rank = 13;clubs.add(c);
        c = new Club(); c.name = "e"; c.rank = 1;clubs.add(c);
        c = new Club(); c.name = "t"; c.rank = 4;clubs.add(c);
        c = new Club(); c.name = "q"; c.rank = 7;clubs.add(c);
        c = new Club(); c.name = "t"; c.rank = 2;clubs.add(c);
        c = new Club(); c.name = "y"; c.rank = 32;clubs.add(c);
        c = new Club(); c.name = "i"; c.rank = 65;clubs.add(c);

        Collections.sort(clubs);

        for (Club club : clubs) {
            System.out.println(club.name);
        }
    }
}