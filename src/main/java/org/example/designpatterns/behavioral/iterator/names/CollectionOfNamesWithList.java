package org.example.designpatterns.behavioral.iterator.names;

import java.util.Iterator;
import java.util.List;

public class CollectionOfNamesWithList  {
    private List<String> names = List.of("Mustafa", "Onur", "Şenay", "Sibel", "Merve");
    
    public Iterator<String> getIterator () {
        return names.iterator();
    }
}
