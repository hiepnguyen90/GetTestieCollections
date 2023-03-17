package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }


    @Test
    public void HashMapTest() {
        //given
        HashMap<String, Integer> tiger = new HashMap<String, Integer>();

        //when
        tiger.put("Hiep", 5);
        Integer expected = 5;

        //then
        Assert.assertEquals(expected, tiger.get("Hiep"));
    }

    @Test
    public void HashMapTest2() {
        //given
        HashMap<String, Integer> tiger = new HashMap<String, Integer>();


        //when
        tiger.put("Hiepberto", 5);
        tiger.remove("Hiepberto");
        Integer expected = 0;
        Integer actual = tiger.size();

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ArrayListTest() {
        //given
        List<String> fish = new ArrayList<>();

        //when
        fish.add("Hiep");
        String expected = "Hiep";

        //then
        Assert.assertEquals(expected, fish.get(0));
    }


    @Test
    public void ArrayListTest2() {
        //given
        List<String> fish = new ArrayList<>();

        //when
        fish.add("Hiep");
        fish.add("Nguyen");
        fish.remove(0);
        String expected = "Nguyen";


        //then
        Assert.assertEquals(expected, fish.get(0));

    }

    @Test
    public void HashSet() {
        //given
        HashSet<String> goldFish = new HashSet<>();

        //when
        goldFish.add("Tony");
        boolean expected = false;

        //then

        Assert.assertEquals(expected, goldFish.isEmpty());

    }

    @Test
    public void HashSet2() {
        //given
        HashSet<String> goldFish = new HashSet<>();

        //when
        goldFish.add("Tony");
        boolean expected = true;

        //then

        Assert.assertEquals(expected, goldFish.contains("Tony"));
    }

    @Test
    public void LinkedListTest() {
        //given
        LinkedList hiep = new LinkedList();

        //when
        hiep.addFirst("Hiep");
        hiep.add("Binh");
        hiep.add("Nguyen");

        String expected = "Nguyen";

        //then
        Assert.assertEquals(expected, hiep.getLast());

    }

    @Test
    public void LinkedListTest2() {
        //given
        LinkedList hiep = new LinkedList();

        //when
        hiep.addFirst("Hiep");
        hiep.add("Binh");
        hiep.add("Nguyen");

        hiep.removeFirst();

        String expected = "Binh";

        //then
        Assert.assertEquals(expected, hiep.getFirst());
    }

    @Test
    public void ArrayDequeTest(){
        //given
        ArrayList <String> zeus = new ArrayList<>();
        zeus.add("Hiep");
        zeus.add("is");
        zeus.add("cool");
        zeus.add("I swear");

        ArrayDeque<String> god = new ArrayDeque<>();
        god.addAll(zeus);
        god.pop();
        String expected = "is";

        Assert.assertEquals(expected, god.getFirst());

    }

    @Test
    public void VectorTest(){
        //given
        ArrayList <String> zeus = new ArrayList<>();
        zeus.add("Hiep");
        zeus.add("is");
        zeus.add("cool");
        zeus.add("I swear");


        //when
        Vector<String> Frog = new Vector<>();
        Frog.addAll(zeus);
        Frog.clear();
        Boolean expected = true;


        //then

    Assert.assertEquals(expected,Frog.isEmpty());

    }
    @Test
    public void stackTest(){
        //given
        Stack<String> stack = new Stack<>();


        //when
        stack.push("CuteCarrot");
        String expected = "CuteCarrot";

        //then
        Assert.assertEquals(expected, stack.peek());

    }

    @Test
    public void treeSetTest(){
        //given
        TreeSet<String> tree = new TreeSet<>();

        //when
        tree.add("GoldFish");
        boolean expected = true;

        //then
        Assert.assertEquals(expected, tree.contains("GoldFish"));
    }

    @Test
    public void iteratorTest(){
        //given

        ArrayList <String> zeus = new ArrayList<>();
        zeus.add("Hiep");
        zeus.add("is");
        zeus.add("cool");
        zeus.add("I swear");

        Iterator<String> iterator;

        //when

        zeus.iterator().hasNext();
        boolean expected = true;

        //then

        Assert.assertEquals(expected,zeus.iterator().hasNext());
    }

    @Test
    public void PriorityQueueTest(){
        //given

        PriorityQueue<String> zeus = new PriorityQueue<>();

        zeus.add("Hiep");
        zeus.add("is");
        zeus.add("cool");
        zeus.add("I swear");

    //when

        String expected = "Hiep";

        //then

    Assert.assertEquals(expected, zeus.peek());

    }

    @Test
    public void comparableTest(){

        //given
        List<String> abc = new ArrayList<>();
        abc.add("a");
        abc.add("b");
        abc.add("c");

        //when

        Integer actual = abc.get(0).compareTo(abc.get(1));
        Integer expected = -1;


    Assert.assertEquals(expected, actual);

    }

}

