import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о сотруднике (имя, фамилия, возраст, пол, оброзование, должность, отдел");
            //Сохраните атрибуты в переменные
            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String floor = scanner.next();
            String obrvizovanie = scanner.next();
            String position = scanner.next();
            String department = scanner.next();
            scanner.nextLine();

            //Используйте конструктор для создание объекта
            list.add(new Employee(surname, name, age, floor, obrvizovanie, position,department));
            System.out.println("Если хотите звкончить ввод данных, введите end");

            String input = scanner.nextLine();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
        }

        while (true) {
            System.out.println("Если не хотите менять данные, введите end");
            String input = scanner.nextLine();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            System.out.println("Введите фамилию и имя рааботника, для которого хотите изменить данные");
            String surname = scanner.next();
            String name = scanner.next();
            scanner.nextLine();

            int empIndex = searchBySurname(list, surname, name);
            if (empIndex != -1) {
                System.out.println("Меняем [Фамилия]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setSurname(scanner.nextLine());
                }
                System.out.println("Меняем [Имя]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setName(scanner.nextLine());
                }
                System.out.println("Меняем [Возраст]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setAge(Integer.parseInt(scanner.nextLine()));
                }
                System.out.println("Меняем [Пол]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setFloor(scanner.nextLine());
                }
                System.out.println("Меняем [оброзование]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setObrvizovanie(scanner.nextLine());
                }
                System.out.println("Меняем [должность]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setPosition(scanner.nextLine());
                }
                System.out.println("Меняем [отдел]?");
                input = scanner.nextLine();
                if ("Da".equalsIgnoreCase(input)) {
                    list.get(empIndex).setDepartment(scanner.nextLine());
                }
            }
        }
        System.out.println("Список сотрудников");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    private static int searchBySurname(List<Employee> employees, String surname, String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSurname().equals(surname) && employees.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
//Akan Zhansarin 15 m hi inge n-1
////Mark Akerman 20 m hi arit n-1