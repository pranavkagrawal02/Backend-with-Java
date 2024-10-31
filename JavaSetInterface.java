/*

SET INTERFACE


It is an unordered collection of objects in which duplicate values cannot be stored.

It is an interface that implements the mathematical set.

This interface contains the methods inherited from the Collection interface and adds a feature that restricts the insertion of the duplicate elements.

Declaration:
public interface Set extends Collection

SET METHODS


Method				Description
add()-adds the specified element to the set
addAll()-adds all the elements of the specified collection to the set
iterator()-returns an iterator that can be used to access elements of the set sequentially
remove()-removes the specified element from the set
removeAll()-removes all the elements from the set that is present in another specified set
retainAll()-retains all the elements in the set that are also present in another specified set
contains()-returns true if the set contains the specified element
containsAll()-returns true if the set contains all the elements of the specified collection
toArray()-returns an array containing all the elements of the set


SET OPERATIONS

The Java Set interface allows us to perform basic mathematical set operations like:
Union - to get the union of two sets x and y, we can use x.addAll(y)
Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
Subset - to check if x is a subset of y, we can use y.containsAll(x)


*/