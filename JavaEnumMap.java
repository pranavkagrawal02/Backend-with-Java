/*

ENUMMAP

Java EnumMap class is the specialized Map implementation for enum keys.

It inherits Enum and AbstractMap classes.

It's a high-performance map implementation, much faster than HashMap.

All keys of each EnumMap instance must be keys of a single enum type.

EnumMap doesn't allow null key and throws NullPointerException when we attempt to insert the null key.

EnumMap is internally represented as arrays.

This representation is extremely compact and efficient.


ENUMMAP METHODS

Method 					Description
clear()-Removes all mappings from this map.
clone()-Returns a shallow copy of this enum map.
containsKey(Object key)-Returns true if this map contains a mapping for the specified key.
containsValue(Object value)-Returns true if this map maps one or more keys to the specified value.
entrySet()-Returns a Set view of the mappings contained in this map.
equals(Object o)-Compares the specified object with this map for equality.

*/