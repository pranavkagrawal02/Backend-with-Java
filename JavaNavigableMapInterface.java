/*

NAVIGABLEMAP INTERFACE
NavigableMap can be easily accessed and traversed in either ascending or descending key order.

The performance and behavior of ascending operations are likely to be faster and efficient than that of the descending order.

It also provide ways to create a Sub Map from existing Map in Java

e.g. headMap whose keys are less than the specified key,
tailMap whose keys are greater than the specified key,

and a subMap which strictly contains keys which fall between tokey and fromKey.


• Syntax:
public interface NavigableMap<K, V> extends SortedMap<K, V>


Here, K is the key Object type and V is the value Object type.


NAVIGABLEMAP INTERFACE


Method						Description
ceilingEntry(K key)-Returns a key-value mapping which is associated with the least key which is greater than or equal to the specified key.

ceilingKey(K key)-Returns the least key which is greater than or equal to the specified key.

descendingKeySet()-Returns the reverse order NavigableSet view for the given keys.

descendingMap()-Returns the reverse order view of the mapping present in the map.

firstEntry()-Returns a key-value mapping which is associated with the least key in the given map.

floorEntry(K key)-Returns a key-value mapping which is associated with the greatest key which is less than or equal to the given key.

*/