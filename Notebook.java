package Java.HWork6;

import java.util.Map;
import java.util.Set;

public class Notebook {
    String processor;
    String ram;
    String hdd;
    String video;
    String system;

    public Notebook(String processor,String ram,String hdd, String video, String system) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.video = video;
        this.system = system;
    }

    @Override
            public String toString() {
                return String.format("Процессор: %s\nОЗУ: %s\nHDD: %s\nВидеокарта: %s\nОперационная система: %s", processor, ram, hdd,
                        video, system);
            }

        

    public static void findProcessor(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
                Integer count = 1;
                for (Notebook notebook : notebooks) {
                    if (notebook.processor.contains(input)) {
                        result.put(String.format("Ноутбук № %d", count), notebook);
                        count++;
                    }
                }
            }
        
            public static void findRam(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
                Integer count = 1;
                for (Notebook notebook : notebooks) {
                    if (notebook.ram.contains(input)) {
                        result.put(String.format("Ноутбук № %d", count), notebook);
                        count++;
                    }
                }
            }
        
            public static void findHdd(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
                Integer count = 1;
                for (Notebook notebook : notebooks) {
                    if (notebook.hdd.contains(input)) {
                        result.put(String.format("Ноутбук № %d", count), notebook);
                        count++;
                    }
                }
            }
        
            public static void findVideo(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
                Integer count = 1;
                for (Notebook notebook : notebooks) {
                    if (notebook.video.contains(input)) {
                        result.put(String.format("Ноутбук № %d", count), notebook);
                        count++;
                    }
                }
            }
        
            public static void findSystem(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
                Integer count = 1;
                for (Notebook notebook : notebooks) {
                    if (notebook.system.contains(input)) {
                        result.put(String.format("Ноутбук № %d", count), notebook);
                        count++;
                    }
                }
            }
        }
        
