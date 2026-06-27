package Lesson_26;

import java.util.*;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;


    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}


class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();


    public void add(String lastName, String phoneNumber) {
        if (!contacts.containsKey(lastName)) {
            contacts.put(lastName, new ArrayList<>());
        }
        contacts.get(lastName).add(phoneNumber);
    }


    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }


    public void printAll() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


public class Collection {  
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1: СТУДЕНТЫ");
        testStudents();

        System.out.println("\n ЗАДАНИЕ 2: ТЕЛЕФОНЫ");
        testPhoneBook();
    }


    public static void removeBadStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
                System.out.println(" Удален студент: " + student.getName());
            }
        }
    }

    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                int currentCourse = student.getCourse();
                student.setCourse(currentCourse + 1);
                System.out.println("Студент " + student.getName() + " переведен на " + student.getCourse() + " курс");
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("   - " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("   (нет студентов на этом курсе)");
        }
    }


    public static void testStudents() {

        List<Integer> grades1 = Arrays.asList(5, 4, 5, 3); 
        List<Integer> grades2 = Arrays.asList(2, 3, 2, 2);  
        List<Integer> grades3 = Arrays.asList(4, 5, 4, 5);  
        List<Integer> grades4 = Arrays.asList(3, 3, 3, 3);  

        List<Student> students = new ArrayList<>();
        students.add(new Student("Анна", "Группа А", 1, grades1));
        students.add(new Student("Петр", "Группа Б", 2, grades2));
        students.add(new Student("Мария", "Группа А", 1, grades3));
        students.add(new Student("Ольга", "Группа В", 2, grades4));

        System.out.println("Студентов до удаления: " + students.size());

        removeBadStudents(students);
        System.out.println("Студентов после удаления: " + students.size());

        promoteStudents(students);

        Set<Student> studentSet = new HashSet<>(students);
        printStudents(studentSet, 2);
        printStudents(studentSet, 3);
    }


    public static void testPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7-999-123-45-67");
        phoneBook.add("Петров", "+7-888-234-56-78");
        phoneBook.add("Иванов", "+7-777-345-67-89"); 
        phoneBook.add("Сидоров", "+7-666-456-78-90");
        phoneBook.add("Иванов", "+7-555-567-89-01");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Кузнецова (нет): " + phoneBook.get("Кузнецов"));

        // Показываем всю книгу
        System.out.println("\n Вся телефонная книга:");
        phoneBook.printAll();
    }
}