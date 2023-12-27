package Homework4;

import java.util.ArrayList;
// import java.util.Random;

 class TeacherService extends SchoolTeacher  {
   
        
        public TeacherService(int number, int age,String name, String Surname,boolean IsQualified,String class_group){
            super(number, age, name, Surname, IsQualified, class_group);
        }

  static void PrintTeacher(ArrayList<? extends SchoolTeacher> list){
              
                for(Object el:list){
                    System.out.println(el.getClass().getSimpleName());
                    System.out.print("Учитель ");
                    System.out.println(el);
                    
                }
            }
    int getNumber(){
        return number;
    }

    
public static void main(String[] args) {
   
        ArrayList<SchoolTeacher> teachers = new ArrayList<>();
        teachers.add(new HighSchoolTeacher(1,25, "Анна", "Васильева", false, "11А"));
        teachers.add(new HighSchoolTeacher(2,20, "Жанна", "Антонова", true, "10В"));
        teachers.add(new AverageSchoolTeacher(3,25, "Степан", "Кузнецов", true, "8А"));
        teachers.add(new BeginnerSchoolTeacher(4,37, "Павел", "Романов", true, "3Г"));
        teachers.add(new BeginnerSchoolTeacher(5,28, "Валерия", "Иванова", true, "2Б"));
        teachers.add(new AverageSchoolTeacher(6,21, "Антон", "Лебедев", false, "7А"));

       
        PrintTeacher(teachers);
            }
}


public class SchoolTeacher {
    int number;
    int age;
    String name;
    String Surname;
    boolean IsQualified;// Информация о том, прошёл ли учитель переквалификацию
    String class_group;

    @Override
 public String toString(){
    return number + "  "+ " Имя: " + name + " Фамилия: " + Surname + " Наличие квалификации: " + IsQualified + " Учебная группа: " + class_group  ;
 }   

    public SchoolTeacher(int number, int age,String name, String Surname,boolean IsQualified,String class_group){
        this.number = number;
        this.age = age;
        this.name = name;
        this.Surname = Surname;
        this.IsQualified = IsQualified;
        this.class_group = class_group;
               
        }



}



class BeginnerSchoolTeacher extends SchoolTeacher {

    public BeginnerSchoolTeacher(int number, int age,String name, String Surname,boolean IsQualified,String class_group){
       
        super(number, age, name, Surname, IsQualified, class_group);
        
    }
}

class AverageSchoolTeacher extends SchoolTeacher{

  

    public AverageSchoolTeacher(int number, int age,String name, String Surname,boolean IsQualified,String class_group){
       
        super(number, age, name, Surname, IsQualified, class_group);
       
    }
}
class HighSchoolTeacher extends SchoolTeacher  {


   
    public HighSchoolTeacher(int number,int age,String name, String Surname,boolean IsQualified,String class_group){
       
        super(number, age, name, Surname, IsQualified, class_group);
        
}
}
