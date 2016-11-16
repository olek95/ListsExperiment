package listsexperiment;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Klasa <code>ListsExperiment</code> reprezentuje program porównujący prędkość
 * ArrayList i LinkedList, w podstawowych operacjach - wstawiania, usuwania i 
 * zwracania pozycji, wykonanych na początku, w środku i na końcu list. 
 * Wyniki podane są w nanosekundach. 
 * @author AleksanderSklorz
 */
public class ListsExperiment {
    public static void main(String[] args) {
        System.out.println("Wyniki są podane w nanosekundach:");
        ArrayList<Integer> aList = new ArrayList(); 
        LinkedList<Integer> lList = new LinkedList(); 
        for(int i = 0; i < 100; i++){
            aList.add(0);
            lList.add(0);
        }
        long before, after; 
        before = System.nanoTime();
        aList.set(0, 1);
        after = System.nanoTime();
        System.out.println("ArrayList wstawianie na początku: " + (after - before)/1000000000);
        before = System.nanoTime();
        lList.set(0, 1);
        after = System.nanoTime();
        System.out.println("LinkedList wstawianie na początku: " + (after - before));
        before = System.nanoTime();
        aList.set(49, 2); 
        after = System.nanoTime();
        System.out.println("ArrayList wstawianie w środku: " + (after - before));
        before = System.nanoTime();
        lList.set(49, 2);
        after = System.nanoTime();
        System.out.println("LinkedList wstawianie w środku: " + (after - before));
        before = System.nanoTime();
        aList.set(99, 3);
        after = System.nanoTime();
        System.out.println("ArrayList wstawianie na końcu: " + (after - before));
        before = System.nanoTime();
        lList.set(99, 3);
        after = System.nanoTime();
        System.out.println("LinkedList wstawianie na końcu: " + (after - before));
        before = System.nanoTime();
        aList.remove(0);
        after = System.nanoTime();
        System.out.println("ArrayList usuwanie na początku: " + (after - before));
        before = System.nanoTime();
        lList.remove(0);
        after = System.nanoTime();
        System.out.println("LinkedList usuwanie na początku: " + (after - before));
        before = System.nanoTime();
        aList.remove(48);
        after = System.nanoTime();
        System.out.println("ArrayList usuwanie w środku: " + (after - before));
        before = System.nanoTime();
        lList.remove(48);
        after = System.nanoTime();
        System.out.println("LinkedList usuwanie w środku: " + (after - before));
        before = System.nanoTime();
        aList.remove(97);
        after = System.nanoTime();
        System.out.println("ArrayList usuwanie na końcu: " + (after - before));
        before = System.nanoTime();
        lList.remove(97);
        after = System.nanoTime();
        System.out.println("LinkedList usuwanie na końcu: " + (after - before));
        before = System.nanoTime();
        aList.get(0);
        after = System.nanoTime();
        System.out.println("ArrayList zwracanie początku: " + (after - before));
        before = System.nanoTime();
        lList.get(0);
        after = System.nanoTime();
        System.out.println("LikedList zwracanie początku: " + (after - before));
        before = System.nanoTime();
        aList.get(48);
        after = System.nanoTime();
        System.out.println("ArrayList zwracanie środka: " + (after - before));
        before = System.nanoTime();
        lList.get(48);
        after = System.nanoTime();
        System.out.println("LinkedList zwracanie środka: " + (after - before));
        before = System.nanoTime();
        aList.get(96);
        after = System.nanoTime();
        System.out.println("ArrayList zwracanie końca: " + (after - before));
        before = System.nanoTime();
        lList.get(96);
        after = System.nanoTime();
        System.out.println("LinkedList zwracanie końca: " + (after - before));
        before = System.nanoTime();
    }
}
