import java.util.*;

public class Frontier {
   private ArrayDeque<int[]> frontier;

   public Frontier() {
     frontier = new ArrayDeque<int[]>();
   }

   public int size() {
     return frontier.size();
   }

   public void add(int[]location) {

   }

   public int[] remove() {
     return frontier.getFirst();
   }
}
