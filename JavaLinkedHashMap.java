/*

LINKEDHASHMAP
• Example:
	// LinkedHashMap with initial capacity 8 and load factor 0.6 
	LinkedHashMap<Key, Value> numbers = new LinkedHashMap<>(8, 0.6f);
	
	
In the above code, we have created a linked HashMap named numbers. 

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by the keys in a map


HASHMAP CLASS METHODS
Method 							Description

V get(Object key)-It returns the value to which the specified key is mapped.

void clear()-It removes all the key-value pairs from a map.

boolean containsValue(Object value)-It returns true if the map maps one or more keys to the specified value.

Set<Map.Entry<K,V>> entrySet()-It returns a Set view of the mappings contained in the map.

void forEach(BiConsumer<? super K,? super V> action)-It performs the given action for each entry in the map until all entries have been processed.

V getOrDefault(Object key, V defaultValue)-It returns the value to which the specified key is mapped.

*/