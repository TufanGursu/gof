package org.example.designpatterns.behavioral.iterator.names;

public class NamesWithListDemo {
    public static void main(String[] args) {
        CollectionOfNamesWithList nameList = new CollectionOfNamesWithList();

        for(java.util.Iterator iter = nameList.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
