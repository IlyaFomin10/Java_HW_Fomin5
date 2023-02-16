//Пусть дан список сотрудников:
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
import java.util.*;

public class task2 {
    public static void main(String[] args) {
               
        String namesString = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        
        String[] namesArray = namesString.split(", ");

        HashMap<String, Integer> names = new HashMap<String, Integer>();

        for (String name : namesArray) {
                    String[] FullName = name.split(" ");
                    if (names.containsKey(FullName[0])) {
                        names.put(FullName[0], names.get(FullName[0]) + 1);  //увеличиваем счетчик 
                    } else {
                        names.put(FullName[0], 1);  //создаем счетчик 
                    }
                }
        
        List<Integer> positions = new ArrayList<Integer>(names.values());
        positions.sort(Collections.reverseOrder()); //сортируем по счетчику в обратном порядке

        HashMap<String, Integer> sortedNames = new LinkedHashMap<String, Integer>();
        for (int pos : positions)
        {
            for (String name : names.keySet()){
                if (pos == names.get(name)) {
                    sortedNames.put(name, pos);
                 }
            }
        }   
        System.out.println(sortedNames);      
    }
}