package Homework3;

import java.util.ArrayList;

import java.util.Iterator; 
import java.util.List; 


public class Flow<Type>  implements Iterable<Type> {

 int NumberOfFlow;    
 int QuantityOfgroups;

void getNumber(int NumberOfFlow){
    System.out.print("Номер потока: ");
    System.out.print(NumberOfFlow);
    System.out.println();
}

void getQuantityOfgroups(int NumberOfFlow){
    System.out.print("Количество групп: ");
    System.out.print(QuantityOfgroups);
    System.out.println();
}

private List<Type> items;



public Flow(int NumberOfFlow,int QuantityOfgroups){
    this.NumberOfFlow = NumberOfFlow;
    this.QuantityOfgroups = QuantityOfgroups;
}
public  Flow(){
    this.items = new ArrayList<>();
}
public void add(Type item){
    items.add(item);
}

@Override
public Iterator<Type> iterator(){
    return items.iterator();
}

}

class Main {
    public static void main(String[] args){
        Flow<String> flow = new Flow<>();
        flow.add("1-ая группа");
        flow.add("2-ая группа");
        flow.add("3-я группа");

        for (String item: flow){
            System.out.println(item);
        }

    }
}