package org.example.designpatterns.behavioral.iterator.names;

public class CollectionOfNames implements Container {
    public String name[] = {"Ali", "Ayşe", "Mehmet", "Murat", "Kemal"};

    @Override
    public Iterator getIterator () {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext () {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next () {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}
