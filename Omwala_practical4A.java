package omwala_practical4a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List; 
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class Omwala_practical4A  {
    public static void main(String[] args) {
        System.out.println("Om Wala S119");
        System.out.println("--- Demonstrating List Interface ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple"); 
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); 
        
        System.out.println("Initial List: " + fruits);
        fruits.add(1, "Grape"); 
        System.out.println("List after adding Grape at index 1: " + fruits);
        System.out.println("First fruit: " + fruits.get(0)); 
        fruits.set(2, "Mango"); 
        System.out.println("List after updating element at index 2 to Mango: " + fruits);
        
        fruits.remove("Apple"); 
        System.out.println("List after removing the first Apple: " + fruits);
        
        fruits.remove(fruits.size() - 1);
        System.out.println("List after removing the last element: " + fruits);
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));
        System.out.println("Does list contain Banana? " + fruits.contains("Banana")); 
        System.out.println("Size of the list: " + fruits.size());
        
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
        System.out.println("\n--- Demonstrating Set Interface ---");
        
        Set<String> uniqueColors = new HashSet<>();
        uniqueColors.add("Red"); 
        uniqueColors.add("Green");
        uniqueColors.add("Blue");
        uniqueColors.add("Red"); 
        System.out.println("Initial Set: " + uniqueColors);
        
        uniqueColors.remove("Green");
        System.out.println("Set after removing Green: " + uniqueColors);
        System.out.println("Does set contain Blue? " + uniqueColors.contains("Blue")); 
        System.out.println("Size of the set: " + uniqueColors.size()); 
        System.out.println("Is the set empty? " + uniqueColors.isEmpty());
        System.out.print("Iterating over the set: ");
        
        Iterator<String> iterator = uniqueColors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Yellow");
        moreColors.add("Blue");
        uniqueColors.addAll(moreColors);
        
        System.out.println("Set after adding more colors: " + uniqueColors);
        System.out.println("\n--- Demonstrating Map Interface ---");
        
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Om", 95);
        studentScores.put("Shreyash", 88);
        studentScores.put("Krish", 76);
        studentScores.put("Alice", 98); 
        System.out.println("Initial Map: " + studentScores);
        System.out.println("Shreyash's score: " + studentScores.get("Shreyash"));
        
        studentScores.remove("Krish"); 
        System.out.println("Map after removing Krish: " + studentScores);
        System.out.println("Does map contain key Shreyash? " + studentScores.containsKey("Shreyash"));
        System.out.println("Does map contain value 98? " + studentScores.containsValue(98));
        System.out.println("Keys in the map: " + studentScores.keySet()); 
        System.out.println("Values in the map: " + studentScores.values()); 
        System.out.println("Entries in the map: " + studentScores.entrySet()); 
        System.out.println("Size of the map: " + studentScores.size());
        
        studentScores.clear(); 
        System.out.println("Map after clearing: " + studentScores);
    }
}
