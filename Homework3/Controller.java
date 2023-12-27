package Homework3;

import java.util.ArrayList;
// import java.util.Comparator;

public class Controller extends StreamComparator<String>  {


    public static int compare1(Stream<String> fl1,Stream<String> fl2){
        return Integer.compare(fl1.QuantityOfgroups, fl2.QuantityOfgroups);
            }
     
     
    public static void main(String[] args) {
            Stream<String> f1 = new Stream<String>(1, 5);
            Stream<String> f2 = new Stream<String>(2, 15);
            Stream<String> f3 = new Stream<String>(3, 4);
            Stream<String> f4 = new Stream<String>(4, 7);
            Stream<String> f5 = new Stream<String>(5, 20);

            ArrayList<Stream<String>> streams= new ArrayList<>();
            streams.add(f1);
            streams.add(f2);
            streams.add(f3);
            streams.add(f4);
            streams.add(f5);

           Comparing com = (fl1,fl2)->compare1(fl1,fl2);
            System.out.println(com.compare1(f1,f2));

            streams.sort(new Controller());
            for (Stream<String> stream:streams){
                System.out.println(stream);
            }
            
        }
             
    }

