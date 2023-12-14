package Test_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;





public class Notebooks {
    public static void main(String[] args){
        Main_Menu();
    }
    public static Set<Notebook> data() {
        Set<Notebook> notebooks = new HashSet<>();

        Notebook notebook1 = new Notebook();
        notebook1.setmodel("Lenovo");
        notebook1.setRAM_Volume("16");
        notebook1.setHD_Volume("300");
        notebook1.setFrequency_process("2");
        notebook1.setColour("Blue");
        notebook1.setPrice("900");

        Notebook notebook2 = new Notebook();
        notebook2.setmodel("Asus");
        notebook2.setRAM_Volume("8");
        notebook2.setHD_Volume("200");
        notebook2.setFrequency_process("3");
        notebook2.setColour("Blue");
        notebook2.setPrice("1500");

        Notebook notebook3 = new Notebook();
        notebook3.setmodel("HP");
        notebook3.setRAM_Volume("4");
        notebook3.setHD_Volume("400");
        notebook3.setFrequency_process("2");
        notebook3.setColour("Blue");
        notebook3.setPrice("1200");

        Notebook notebook4 = new Notebook();
        notebook4.setmodel("Lenovo");
        notebook4.setRAM_Volume("12");
        notebook4.setHD_Volume("500");
        notebook4.setFrequency_process("6");
        notebook4.setColour("Blue");
        notebook4.setPrice("1000");

        Notebook notebook5 = new Notebook();
        notebook5.setmodel("HP");
        notebook5.setRAM_Volume("8");
        notebook5.setHD_Volume("400");
        notebook5.setFrequency_process("2");
        notebook5.setColour("Blue");
        notebook5.setPrice("1000");

        Notebook notebook6 = new Notebook();
        notebook6.setmodel("Asus");
        notebook6.setRAM_Volume("8");
        notebook6.setHD_Volume("100");
        notebook6.setFrequency_process("4");
        notebook6.setColour("Red");
        notebook6.setPrice("800");

         Notebook notebook7 = new Notebook();
        notebook7.setmodel("HP");
        notebook7.setRAM_Volume("8");
        notebook7.setHD_Volume("100");
        notebook7.setFrequency_process("4");
        notebook7.setColour("Red");
        notebook7.setPrice("500");

         Notebook notebook8 = new Notebook();
        notebook8.setmodel("Lenovo");
        notebook8.setRAM_Volume("8");
        notebook8.setHD_Volume("100");
        notebook8.setFrequency_process("4");
        notebook8.setColour("Red");
        notebook8.setPrice("100");

        Notebook notebook9 = new Notebook();
        notebook9.setmodel("HP");
        notebook9.setRAM_Volume("8");
        notebook9.setHD_Volume("100");
        notebook9.setFrequency_process("4");
        notebook9.setColour("Black");
        notebook9.setPrice("800");

        Notebook notebook10 = new Notebook();
        notebook10.setmodel("Asus");
        notebook10.setRAM_Volume("10");
        notebook10.setHD_Volume("100");
        notebook10.setFrequency_process("4");
        notebook10.setColour("White");
        notebook10.setPrice("400");

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        


    
        return notebooks;
        
     
}
    public static Set<Notebook> findByPrice(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите минимальный предел цены товара: ");
        Scanner sc1 = new Scanner(System.in);
        int minPrice = sc1.nextInt();
        System.out.println("Введите максимальный предел цены товара: ");
        Scanner sc2 = new Scanner(System.in);
        int maxPrice = sc2.nextInt();
        for (Notebook Notebook: Notebooks){
            if (Integer.parseInt(Notebook.getPrice()) >= minPrice && Integer.parseInt(Notebook.getPrice())<=maxPrice){
                res.add(Notebook);
            }
        }
        return res;
    }
    public static Set<Notebook> findByHD_Volume(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите минимальный предел ёмкости жёсткого диска (GB): ");
        Scanner sc1 = new Scanner(System.in);
        int minVol = sc1.nextInt();
        System.out.println("Введите максимальный предел ёмкости жёсткого диска(GB): ");
        Scanner sc2 = new Scanner(System.in);
        int maxVol = sc2.nextInt();
        for (Notebook Notebook: Notebooks){
            if (Integer.parseInt(Notebook.getHD_Volume()) >= minVol && Integer.parseInt(Notebook.getHD_Volume())<=maxVol){
                res.add(Notebook);
            }
        }
        return res;
    }
public static Set<Notebook> findByRAM_Volume(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите минимальный предел ёмкости оперативной памяти (GB): ");
        Scanner sc1 = new Scanner(System.in);
        int minVol = sc1.nextInt();
        System.out.println("Введите максимальный предел ёмкости оперативной памяти (GB): ");
        Scanner sc2 = new Scanner(System.in);
        int maxVol = sc2.nextInt();
        for (Notebook Notebook: Notebooks){
            if (Integer.parseInt(Notebook.getRAM_Volume()) >= minVol && Integer.parseInt(Notebook.getRAM_Volume())<=maxVol){
                res.add(Notebook);
            }
        }
        return res;
    }
public static Set<Notebook> findByFrequency_of_Processor(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите минимальный предел тактовой частоты процессора (GHz): ");
        Scanner sc1 = new Scanner(System.in);
        int minFreq = sc1.nextInt();
        System.out.println("Введите максимальный предел тактовой частоты процессора (GHz): ");
        Scanner sc2 = new Scanner(System.in);
        int maxFreq = sc2.nextInt();
        for (Notebook Notebook: Notebooks){
            if (Integer.parseInt(Notebook.getFrequency_process()) >= minFreq && Integer.parseInt(Notebook.getFrequency_process())<=maxFreq){
                res.add(Notebook);
            }
        }
        return res;
    }
   public static Set<Notebook> findByColour(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите желаемый цвет: ");
        Scanner sc1 = new Scanner(System.in);
        String colour = sc1.nextLine();
        
        for (Notebook Notebook: Notebooks){
            if (Notebook.getColour().equals(colour)){
                res.add(Notebook);
            }
        }
        return res;
    }

    public static Set<Notebook> findByModel(Set<Notebook> Notebooks){
        Set<Notebook> res = new HashSet<>();
        System.out.println("Введите желаемую модель: ");
        Scanner sc1 = new Scanner(System.in);
        String model = sc1.nextLine();
        
        for (Notebook Notebook: Notebooks){
            if (Notebook.getmodel().equals(model)){
                res.add(Notebook);
            }
        }
        
        return res;
    }
     
    static void printSet(Set<Notebook> Notebooks){
        for (Notebook Notebook: Notebooks){
            System.out.println(Notebook);
        }
    }
    static void printList(ArrayList<String> Notebooks){
        for (String Notebook: Notebooks){
            System.out.println(Notebook);
        }
    }

    public static ArrayList<String> SetToString(Set<Notebook> Note){
        ArrayList<String> list = new ArrayList<>();

        for (Notebook Notebook: Note){
            String set = Notebook.toString();
            list.add(set);
            // System.out.println(list);
        }
        
        
        return list;
    }
     public static void Main_Menu(){
       System.out.println("1. Показать все имеющиеся товары");
        System.out.println("2. Фильтр по выбранному критерию");
        System.out.println("3. Выход");
        System.out.println("Введите номер опции: ");
       Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
       
        
        switch (option) {
            case "1":
                printSet(data());
                Main_Menu();
                break;
            case "2":
                Filter_Menu();
                break;
            case "3":
                System. exit(0);
                break;
                
                
            default:
            System.out.println("Некорректное значение!");
            Main_Menu();
                break;
        
    }
}
    public static void Filter_Menu(){
        boolean k = true;

        ArrayList<String>list1 = new ArrayList<>();
        
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();
        ArrayList<String>list4 = new ArrayList<>();
        ArrayList<String>list5 = new ArrayList<>();
        ArrayList<String>list6 = new ArrayList<>();
        ArrayList<String>list = new ArrayList<>();
        list = SetToString(data());
        while (k) {
            
        
        System.out.println("1. Model");
        System.out.println("2. HD_Volume");
        System.out.println("3. RAM_Volume");
        System.out.println("4. Frequency_of_processor");
        System.out.println("5. Colour");
        System.out.println("6. Price");
        System.out.println("7. Выбор характеристик закончен");
        System.out.println("8. Back_to_Main_Menu");
        System.out.println("Введите номер характеристики товара или вернитесь в предыдущее меню: ");
        Scanner sc1 = new Scanner(System.in);
        String option = sc1.nextLine();
        
        switch (option) {
            
            case "1":
                list1 = SetToString(findByModel(data()));
                list.retainAll(list1);
               
                break;
            case "2":
                list2 = SetToString(findByHD_Volume(data()));
                list.retainAll(list2);
               
                break;
            case "3":
                list3 = SetToString(findByRAM_Volume(data()));
                list.retainAll(list3);
               
                break;
            case "4":
                list4 = SetToString(findByFrequency_of_Processor(data()));
                list.retainAll(list4);
                
                break;
            case "5":
                list5 = SetToString(findByColour(data()));
                list.retainAll(list5);
                
                break;
            case "6":
                list6 = SetToString(findByPrice(data()));
                list.retainAll(list6);
                
                break;
            case "7":
                printList(list);
                
                Filter_Menu();
                break;
            case "8":
                Main_Menu();
                break;
        
            default:
                break;
        }
    }
}
   
}