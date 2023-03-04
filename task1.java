package Java.HWork6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task1 {

    public static Integer selection() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите цифру, соответствующую необходимому критерию выбора: ");
                System.out.println(
                        "1 - процессор\n2 - оперативная память\n3 - жесткомий диск\n4 - видеокарта\n5 - операционная система\n");
                System.out.print("Ваш выбор: ");
                return scanner.nextInt();
            }
    public static void resultSelection(Map<String, Notebook> result){
            for (var notebook : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", notebook.getKey(), notebook.getValue().toString());
        }
    }
    
    public static void main(String[] args) {
        Map<Integer, String> selection = new HashMap<>();
        Map<String, Notebook> result = new LinkedHashMap<>();
        Set<Notebook> notebooks = new HashSet<>();


        Notebook notebook1 = new Notebook("AMD Ryzen 5 5600H", "8 Гб", "512 Гб", "GeForce RTX 3060",
                "DOS");
        Notebook notebook2 = new Notebook("AMD Ryzen 7 5800H", "16 Гб", "512 Гб", "GeForce RTX 3060",
                "no OS");
        Notebook notebook3 = new Notebook("Intel Core i5 11300H", "16 Гб", "1 Тб", "GeForce MX450",
                "Windows 10");
        Notebook notebook4 = new Notebook("Apple M1 Pro", "32 Гб", "512 Гб", "Apple M1 Pro",
                "Mac OS");
        Notebook notebook5 = new Notebook("AMD Ryzen 7 4800H", "16 Гб", "1 Тб", "GeForce RTX 3050 Ti",
                "Windows 11");
        

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
       
        Scanner scanner = new Scanner(System.in);
        selection.put(1, "processor");
        selection.put(2, "ram");
        selection.put(3, "hdd");
        selection.put(4, "video");
        selection.put(5, "system");
        Integer choice = selection();
        if (selection.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.printf("Введите название %s: \n", selection.get(1));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findProcessor(notebooks, input, result);
                    resultSelection(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s : \n", selection.get(2));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findRam(notebooks, input, result);
                    resultSelection(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s : \n", selection.get(3));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findHdd(notebooks, input, result);
                    resultSelection(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s : \n", selection.get(4));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findVideo(notebooks, input, result);
                    resultSelection(result);
                    break;
                }
                case 5: {
                    System.out.printf("Введите название %s : \n", selection.get(5));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findSystem(notebooks, input, result);
                    resultSelection(result);
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}