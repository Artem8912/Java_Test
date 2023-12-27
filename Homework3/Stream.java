package Homework3;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream<Type> implements Iterable<Type> {
    int NumberOfFlow;    
 int QuantityOfgroups;


 public Stream(int NumberOfFlow,int QuantityOfgroups){
    this.NumberOfFlow= NumberOfFlow;
    this.QuantityOfgroups=QuantityOfgroups;
 }

 List<Type> items; 

 
public  Stream(){
    this.items = new ArrayList<>();
}
public void add(Type item){
    items.add(item);
}

@Override
public Iterator<Type> iterator(){
    return items.iterator();
}

 @Override
 public String toString(){
    return "Номер потока:  "+NumberOfFlow +" Количество групп: "+QuantityOfgroups;
 }
}

class StreamComparing {
    public static void main(String[] args){
            Stream<String> f1 = new Stream<String>(1, 5);
            Stream<String> f2 = new Stream<String>(2, 9);
            Stream<String> f3 = new Stream<String>(3, 4);
            Stream<String> f4 = new Stream<String>(4, 8);
            Stream<String> f5 = new Stream<String>(5, 10);

            ArrayList<String> streams= new ArrayList<>();
            
            streams.add(f1.toString());
            streams.add(f2.toString());
            streams.add(f3.toString());
            streams.add(f4.toString());
            streams.add(f5.toString());
            
            for(String item:streams){
               System.out.println(item);
            }
            

                       
        }
    }


