/*

Java SortedMap Interface

SortedMap is an interface in Java that is a subinterface of the Map interface.

The map entries are arranged in ascending order, sorted according to their keys.

It ensures that the entries are kept in ascending key order.

It enables very efficient manipulation of map subsets.

The SortedMap interface is implemented by the TreeMap and ConcurrentSkipListMap classes.

• Syntax:
interface SortedMap<K, V>
	extends Map<K, V>


The main characteristic of a SortedMap is that it orders the keys by their natural ordering, or by a specified comparator.

So consider using a TreeMap when you want a map that satisfies the following criteria:

null key or null value is not permitted.

The keys are sorted either by natural ordering or by a specified comparator.

SORTEDMAP METHODS
Method				Description
comparator()-returns a comparator that can be used to order keys in a map
firstKey()-returns the first key of the sorted map
lastKey()-returns the last key of the sorted map
headMap(key)-returns all the entries of a map whose keys are less than the specified key
tailMap(key)-returns all entries of a map whose keys are greater than or equal to specified key
subMap(key1, key2)-returns all the entries of a map whose keys lies in between key1 and key2 including key1

*/