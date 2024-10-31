/*

HASHSET

Java HashSet class is used to create a collection that uses a hash table for storage.

It inherits the AbstractSet class and implements Set interface.

HashSet stores the elements by using a mechanism called hashing.

HashSet contains unique elements only.

HashSet allows null value.

HashSet is the best approach for search operations.

Here, elements are inserted on the basis of their hashcode.

The initial default capacity of HashSet is 16, and the load factor is 0.75.


HASHSET

Declaration of HashSet:

public class HashSet<E> extends AbstractSet<E> 
implements Set<E>, Cloneable, Serializable

where E is the type of elements stored in a HashSet.



HASHSET METHODS
Method				Description
add(E e)-Used to add the specified element if it is not present, if it is present then return false.

clear()-Used to remove all the elements from the set.

contains(Object o)-Used to return true if an element is present in a set.

remove(Object o)-Used to remove the element if it is present in set.

iterator()-Used to return an iterator over the element in the set.

isEmpty()-Used to check whether the set is empty or not. Returns true for empty and false for a non-empty condition for set.

clone()-Used to create a shallow copy of the set.



*/