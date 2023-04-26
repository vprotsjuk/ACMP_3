import java.util.*;

public class Stepan_13_08_22_Entry_Set {
    public static void main(String[] args) throws Exception {

        HashSet<Integer> firstPersonsGroup = createGroup();
        System.out.println(firstPersonsGroup);
        HashSet<Integer> secondPersonsGroup = createGroup2();
        System.out.println(secondPersonsGroup);

        int[] one = {1,5,3,4,2,6,2};
        int[] two = {7,2,6,8,6,2,3};
        HashMap<Integer, HashSet<Integer>> allPersonsLinks = getLink(one, two);
        System.out.println(allPersonsLinks + "111");
        removeSomeGroupFromLinks(allPersonsLinks, secondPersonsGroup);

        removeLinksWithSameGroup(allPersonsLinks, firstPersonsGroup);
        System.out.println(allPersonsLinks);
        removeKeysWithEmptyValue(allPersonsLinks);

        System.out.println(allPersonsLinks);
        printResult(allPersonsLinks);


    }

    static void removeSomeGroupFromLinks(HashMap<Integer, HashSet<Integer>> allPersonsLinks, HashSet<Integer> group) {
        for (int key : group) {
            allPersonsLinks.remove(key);
        }
    }

    static void removeLinksWithSameGroup(HashMap<Integer, HashSet<Integer>> allPersonsLinks, HashSet<Integer> group) {
        for (HashSet<Integer> values : allPersonsLinks.values()) {
            for (int groupMember : group) {
                values.remove(groupMember);

            }
        }
    }

    static HashSet<Integer> createGroup() {
        HashSet<Integer> group = new HashSet<>();
        group.add(1);
        group.add(2);
        group.add(3);
        group.add(4);
        group.add(0);

        return group;
    }

    static HashSet<Integer> createGroup2() {
        HashSet<Integer> group = new HashSet<>();
        group.add(5);
        group.add(6);
        group.add(7);
        group.add(8);
        group.add(9);
        return group;
    }

    static void createLink(HashMap<Integer, HashSet<Integer>> mapWithLinks,
                           int person1, int person2) {

        if (mapWithLinks.containsKey(person1)) {
            mapWithLinks.get(person1).add(person2);
        } else {
            HashSet<Integer> listOfValue = new HashSet<>();
            listOfValue.add(person2);
            mapWithLinks.put(person1, listOfValue);
        }
    }

    static HashMap<Integer, HashSet<Integer>> getLink(int[] one, int[] two) throws Exception {
        if(one.length != two.length){
            throw new Exception("ERROR LENGHT MUST BE SAME");
        }
        HashMap<Integer, HashSet<Integer>> mapWithLinks = new HashMap<>();
        for (int i = 0; i < one.length; i++) {
            createLink(mapWithLinks, one[i], two[i]);
            createLink(mapWithLinks, two[i], one[i]);
        }
        return mapWithLinks;
    }

    private static void removeKeysWithEmptyValue(HashMap<Integer, HashSet<Integer>> allPersonsLinks) {
        ArrayList<Integer> emptyValues = new ArrayList<>();
        for (Map.Entry<Integer, HashSet<Integer>> pair : allPersonsLinks.entrySet()) {
            if (pair.getValue().isEmpty()) {
                emptyValues.add(pair.getKey());
            }
        }
        for (int index : emptyValues) {
            allPersonsLinks.remove(index);

        }
    }

    private static void printResult(HashMap<Integer, HashSet<Integer>> allPersonsLinks) {
        for (Map.Entry<Integer, HashSet<Integer>> pair : allPersonsLinks.entrySet()) {
            for (int i : pair.getValue()) {
                System.out.println(pair.getKey() + " " + i);
            }
        }
    }
}
