package Homework3;

import java.util.Comparator;

public class StreamComparator<String> implements Comparator<Stream<String>> {
    
                    @Override
                public int compare(Stream<String> f1,Stream<String> f2){
                return Integer.compare(f1.QuantityOfgroups, f2.QuantityOfgroups);
                    }
}
