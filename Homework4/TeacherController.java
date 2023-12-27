package Homework4;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import java.util.Scanner;

public class TeacherController<T,Type1 extends Number,Type2> {
    
    // Scanner s = new Scanner(System.in);

    // int a = s.nextInt();

    private T num;
    private Type1 age;
    private Type2 class_group;

    public TeacherController(T num,Type1 age,Type2 class_group){
            this.num = num;// номер учителя
            this.age = age;
            this.class_group = class_group;
    }
T getNumber(){
    return num;
}

Type1 getAge(){
    return age;
}

Type2 getClass_Group(){
    return class_group;
}

@Override
public String toString(){
    return "Возраст " + age + " Учебная группа " + class_group;
}

    public static void main(String[] args) {

        TeacherController<Integer,Integer,String> teacher1 = new TeacherController<Integer,Integer,String>(1,35, "7B");
        TeacherController<Integer,Double,String> teacher2 = new TeacherController<Integer,Double,String>(2,27.5, "8A");
        TeacherController<Integer,Float,String> teacher3 = new TeacherController<Integer,Float,String>(3,23.5F, "5L");

        ArrayList<TeacherController> teachers = new ArrayList<>();
         
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        for(TeacherController teach:teachers){
            System.out.println("Учитель " + teach.getNumber());
            System.out.println(teach);
            
        }


        
    }
}
