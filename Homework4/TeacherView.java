package Homework4;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeacherView  {
        int pupils;
        public TeacherView(int pupils){
                this.pupils = pupils;// Количество учеников у одного учителя

        }

        
        static void PrintTeach(List<?> list){
                for(Object el:list){
                    System.out.printf("%-7s",el +" ");
                }
        }
        @Override
        public String toString(){
            return "Количество учеников "+pupils;
        }


        public static void main(String[] args) {
            
        List<Integer> numberOfpupil = Arrays.asList(1,2,3,4,5); 
        List<String> namesOfpupils = Arrays.asList("Вася","Маша","Алина","Коля","Вера");      


        TeacherView t1 = new TeacherView(5);
        System.out.println(t1);

        PrintTeach(numberOfpupil);
        System.out.println();
        PrintTeach(namesOfpupils);
        }
}


