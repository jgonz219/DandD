import java.util.*;

public class Encounter {
    Scanner in = new Scanner(System.in);

    public Encounter(int numOfPlayers, int numOfEnemies) {
        Set<String> order = setInitiatives(numOfPlayers, numOfEnemies);
        System.out.println(order);
    }

    public Set<String> setInitiatives(int numOfPlayers, int numOfEnemies) {
        HashMap<String, Integer> characters = new HashMap<String, Integer>();

        //Set players initiatives
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Initiative for Player " + i);
            int ini = in.nextInt();
            characters.put("Player " + i, ini);
        }

        //Set enemies initiatives
        for (int i = 0; i < numOfEnemies; i++) {
            System.out.println("Initiative for Enemy " + i);
            int ini = in.nextInt();
            characters.put("Enemy " + i, ini);
        }

        return sortByValues(characters);
    }

    private static Set<String> sortByValues(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        // Defined Custom Comparator here
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return ((Comparable<Integer>) ((Map.Entry<String, Integer>) (o2)).getValue())
                        .compareTo(((Map.Entry<String, Integer>) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedHashMap.put((String) entry.getKey(), (int) entry.getValue());
        }
        return sortedHashMap.keySet();
    }

}
