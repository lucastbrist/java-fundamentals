package labs_examples.datastructures.hashmap.examples;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomHashMapEdit<K, V> {

    // create the underlying Entry array with the initial size of 10
    private EntryEdit<K, V>[] hashmap = new EntryEdit[10];

    // track the current number of elements in the hashmap
    private int elements = 0;

    // track values
    private int values = 0;


    /**
     * Hashes the given key and returns a table index
     *
     * @param key to be hashed
     * @return a table index
     */
    private int hashItUp(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int code = Math.abs(key.hashCode() % hashmap.length);
        // the result will be the index where we can find and/or place entries
        return code;
    }

    /**
     * Adds the key-value pair to the hashmap
     *
     * @param key   a key Object
     * @param value a value Object
     */
    public void add(K key, V value) {
        // call the hash() method to get the index to place the element
        int code = hashItUp(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        EntryEdit<K,V> mapEntry = new EntryEdit<>(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (hashmap[code] == null) {

            hashmap[code] = mapEntry;
            elements++;
            values++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            EntryEdit<K, V> first = hashmap[code];

            mapEntry.next = first;
            first = mapEntry;
            elements++;
            values++;
        }

        // check for resize
        if (values > hashmap.length * .50) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resizeIt();
        }
    }

    public void update(K key, V value) {

        if (getCode(key) == null) {
            // if the get() method returns null, there's nothing to update
            return;
        }

        int code = hashItUp(key);

        EntryEdit<K, V> entry = hashmap[code];
        entry.setThatValue(value);
    }

    /**
     * Resizes the underlying array to triple its previous size and copies the old values into it
     */
    private void resizeIt() {
        // make a copy of the existing table and call it "old"
        EntryEdit<K, V>[] copy = hashmap;
        // create a new Entry[] that is thrice the size of the old one
        hashmap = new EntryEdit[copy.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < copy.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                EntryEdit<K, V> newEntry = copy[i];
                // call the put() method passing the key and value to add this element to the new table
                add((K) newEntry.getThatKey(), (V) newEntry.getThatValue());

                // check to see if this entry is actually the start of a linked list
                while (newEntry.next != null) {
                    // if it is, traverse to the next node
                    newEntry = newEntry.next;
                    // and call the put() method to add this element
                    add((K) newEntry.getThatKey(), (V) newEntry.getThatValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    /**
     * Removes the pair at the given key from the hashmap
     *
     * @param key of the pair to be removed
     */
    public void remove(K key) {

        // ensure key exists by calling the get() method
        if (getCode(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int code = hashItUp(key);

        // get the Entry at the index
        EntryEdit<K, V> entryAt = hashmap[code];

        // if this entry has the matching key, remove the element at this index
        if (entryAt.getThatKey().equals(key)){
            hashmap[code] = null;
            elements--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entryAt.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entryAt.next.getThatKey() != key) {
                // traverse the linked list to the next node
                entryAt = entryAt.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entryAt.next.next != null){
            entryAt.next = entryAt.next.next;
            elements--;
            return;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entryAt.next = null;
            elements--;
            return;
        }
    }

    /**
     * Finds the value of a key
     *
     * @param key to search for
     * @return value of the given key
     */
    public V getCode(K key) {

        if (getCode(key) == null) {
            System.out.println("This element does not exist!");
            return null;
        }

        // call the hash() method to get the index for the key
        int code = hashItUp(key);

        // nothing at key - return null
        if (hashmap[code] == null) {
            return null;
        }

        // otherwise, get the Entry at the index
        EntryEdit<K, V> entry = hashmap[code];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getThatKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getThatValue();
    }

    /**
     * For Testing: gets the size of the underlying array
     *
     * @return int storage size
     */
    public int getSize() {
        return hashmap.length;
    }

}

/**
 * A Key-Value Pair
 */
 class EntryEdit<K, V> {
    private K primaryKey;
    private V storedValue;
    // it means this is a LinkedList
    EntryEdit next = null;

    EntryEdit(K key, V value) {
        this.primaryKey = key;
        this.storedValue = value;
    }

    public K getThatKey() {
        return primaryKey;
    }

    public V getThatValue() {
        return storedValue;
    }

    public void setThatValue(V value) {
        this.storedValue = value;
    }
}
