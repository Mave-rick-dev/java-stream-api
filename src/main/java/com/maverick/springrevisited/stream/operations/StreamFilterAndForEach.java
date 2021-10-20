package com.maverick.springrevisited.stream.operations;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Here, class Student serves as a DAO layer to imitate the practical scenario
 *  when we require to obtain any collection form the database
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
class StudentDao{
    private String name;
    private String faculty;

    public static List<StudentDao> getStudentList() {
        return List.of(
                new StudentDao("Manish Adhakari", "BIT"),
                new StudentDao("Om Narayan Singh", "BSCIT"),
                new StudentDao("Anish Sharma", "MBA"),
                new StudentDao("Punish Sharma", "BIT")
        );
    }
}

public class StreamFilterAndForEach {
    public static void main(String[] args) {

        /**
         * Here, we use ForEach(Consumer<T>) to iterate through the studentList stream
         *  - Implementation for functional method accept(T) prints every student instance
         *      during iteration
         */
        List<StudentDao> studentList = StudentDao.getStudentList();
        studentList.stream().forEach(t -> System.out.println(t));

        List<StudentDao> bitStudent = studentList.stream().filter(t -> t.getFaculty().equalsIgnoreCase("bit"))
                .collect(Collectors.toList());
        System.out.println(bitStudent instanceof List);
    }
}
