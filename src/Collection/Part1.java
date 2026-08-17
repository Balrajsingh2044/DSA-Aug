package Collection;
import java.lang.reflect.Array;
import java.util.*;

public class Part1 {
    public static void main(String[] args){
        //List -> interface
        // Concrete class -> ArrayList
        //Ways to implement a array list:
        Collection<Integer> coll = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        //.clear
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //get(index) -> get the element at index
        //set(index, value) -> set the value at the specific index
        list.set(0,25);
        Object[] arr1 = list.toArray();
        for (Object obj : arr1){
            System.out.print(obj+ " ");
        }

        System.out.println("\n"+list.contains(100));
        //ArrayList Methods:
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(14);
        list1.add(67);
        list1.add(43);

        System.out.println("Arraylist Methods");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("Sorted :" + list1);
        Collections.sort(list1, Collections.reverseOrder());
        ArrayList<Integer> newlist = (ArrayList<Integer>) list1.clone();
        System.out.println(newlist);
        //.ensureCapacity(int capacity)
        //.indexOf(int element);
        //.isEmpty();


        System.out.println("Linkedlist Methods");
        //Every same methods as arraylist except clone()
        //.lastIndexOf(int element) -> return index of last cody the element

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("Queue Methods");
        System.out.println("Queue " + ll);
        ll.addFirst(23);
        ll.addLast(45);
        ll.addFirst(14);
        ll.addFirst(67);
        ll.addFirst(31);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.getFirst());
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.getLast());
        System.out.println("Peek " + ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);

        //descending order
        System.out.println("Descending order: " + list1);

        //Vectors
        System.out.println("Vectors");
        List<Integer> vec = new Vector<>();
        //toArray
        //toString
        //Stack -> vector -> list -> collection
        System.out.println("Stacks");
        Stack<Integer> s = new Stack<>();

        s.push(23);
        s.push(34);
        s.push(12);
        s.push(56);
        s.push(27);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search(23));
        System.out.println(s.empty());
    }
}
