/*

WeakHashMap is a Hash table based implementation of the Map interface, with weak keys.
Entry in WeakHashMap will automatically be removed when its key is no longer in ordinary use.
Both null values and the null key are supported.
This class has performance characteristics similar to those of the HashMap class and has the same efficiency parameters of initial capacity and load factor.


//WeakHashMap creation with capacity 8 and load factor 0.6 
WeakHashMap<Key, Value> numbers = new WeakHashMap<>(8, 0.6);


In the above code, we have created a weak HashMap named numbers. Here,
Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Notice the part new WeakHashMap<>(8, 0.6). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this map is 8. Meaning, it can store 8 entries.

loadFactor - The load factor of this map is 0.6. This means whenever our hash table is filled by 60%, the entries are moved to a new hash table of double the size of the original hash table.

Method 					Description
clear()-Removes all the entries from the map
containsKey()-Checks if the map contains the specified key and returns a boolean value
containsValue()-Checks if the map contains the specified value and returns a boolean value
size()-Returns the size of the map
isEmpty()-Checks if the map is empty and returns a boolean value

*/