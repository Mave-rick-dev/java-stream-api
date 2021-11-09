package com.maverick.springrevisited.stream.operations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

/**
 * @Project java-stream-api
 * @Author mave on 11/2/21
 */
public class MapSortDemo {

    public static void main(String[] args) {

        Map<String, Integer> studentIdMap = new HashMap<>();
        studentIdMap.put("Manish Adhikari", 001);
        studentIdMap.put("Kishan Kurmi", 002);
        studentIdMap.put("Anish Londe", 003);
        studentIdMap.put("Om Gupta", 004);

        /**
         * Traditional sort: Collections
         */

        //Entry set of List of Map above
        List<Map.Entry<String, Integer>> students = new ArrayList<>(studentIdMap.entrySet());

        Collections.sort(students, (std1, std2)-> std2.getValue().compareTo(std1.getValue()));

        /*for(Map.Entry<String, Integer> entry: students){
            System.out.println(entry);
        }*/

        /**
         * Stream approach to sorting Map
         *  - comparingByValue()
         *  - comparingByKey()
         */
        studentIdMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
class Employee{
    private String name;
    private Integer salary;
}
class MapSortUseCase{
    public static void main(String[] args) {
        Map<Employee, Integer> employeeIntegerMap = new TreeMap<>(
                (o1, o2) -> o2.getSalary().compareTo(o1.getSalary())
        );

        employeeIntegerMap.put(new Employee("Om", 10000), 001);
        employeeIntegerMap.put(new Employee("Maish", 15000), 002);
        employeeIntegerMap.put(new Employee("Anish", 20000), 003);
        employeeIntegerMap.put(new Employee("Punish", 25000), 004);

        System.out.println(employeeIntegerMap);
        System.out.println("**************************");
        //Stream approach to sort the Map above by salary (attribute of custom object Employee)
        employeeIntegerMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(empMap -> System.out.println(empMap.getKey().getName() + " " + empMap.getKey().getSalary()));

    }
}
