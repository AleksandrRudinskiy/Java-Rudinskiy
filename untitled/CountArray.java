import java.util.List;
import java.util.stream.Collectors;

public class CountArray {

    public static List<Integer> findCounts(List<Integer> countlist) {
        return countlist.stream().filter(c -> c % 3 == 0).collect(Collectors.toList());
    }
}
