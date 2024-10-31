/*
TREEMAP

Java TreeMap class is a red-black tree based implementation.
It provides an efficient means of storing key-value pairs in sorted order.
Java TreeMap contains values based on the key.
It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
It cannot have a null key but can have multiple null values and maintains ascending order.


• Syntax:
public class TreeMap<K, V> extends AbstractMap<K, V> 
implements NavigableMap<K, V>, Cloneable,Serializable


FEATURES OF TREEMAP

This class is a member of the Java Collections Framework.

The class implements Map interfaces including NavigableMap, Sorted Map, and extends AbstractMap class.

TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown.

However, multiple null values can be associated with different keys.

Entry pairs returned by the methods in this class and its views represent snapshots of mappings at the time they were produced.

They do not support the Entry.set. Value method.


TREEMAP METHODS
Method				Description
Map.Entry<K, V> ceilingEntry(K key)-It returns the key-value pair having the least key, greater than or equal to the  specified key, or null if there is no such key.

K ceilingKey(K key)-It returns the least key, greater than the specified key or null if there is no such key.

void clear()-It removes all the key-value pairs from a map.

Object clone()-It returns a shallow copy of TreeMap instance.

Comparator<? super K> comparator()-It returns the comparator that arranges the key in order.

NavigableSet<K> descendingKeySet()-It returns a reverse order NavigableSet view of the keys contained in map.


*/