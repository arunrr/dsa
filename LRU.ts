// Create a data structure that implements the requirements of a Least recently
// Used (LRU) cache with O(1) average time complexity
//
// Pseudocode
// Create an object with a value field which is key-value pair data structure
// And a method setItem on that object to mutate the value field
// And a method getItem on that object to get the value of the key provided
//

// Implementation

export class LRU {
  capacity: number;
  cache: Map<string, number>;

  constructor(capacity: number) {
    this.capacity = capacity;
    this.cache = new Map();
  }

  getItem(key: string) {
    const item = this.cache.get(key);

    // If item is present remove and add again at the end of map
    // End of map has recently used item in the cache and first element will be the oldest in cache
    if (item) {
      this.cache.delete(key);
      this.cache.set(key, item);
    }

    return item;
  }

  // Return the first element's key in cache
  get getOldestItem() {
    return this.cache.keys().next().value;
  }

  setItem(key: string, value: number) {
    // if key is present
    if (this.cache.has(key)) {
      this.cache.delete(key);
    }

    // Delete oldest item if cache capacity is full
    else if (this.cache.size === this.capacity) {
      this.cache.delete(this.getOldestItem);
    }

    this.cache.set(key, value);
  }
}

// Testing
// const newCache = new LRU(5);

// newCache.setItem("a", 1);
// newCache.setItem("b", 2);
// newCache.setItem("c", 3);
// newCache.setItem("d", 4);
// newCache.setItem("e", 5);

// console.log(newCache.cache);

// newCache.getItem("c");
// newCache.getItem("a");
// newCache.setItem("f", 10);

// console.log(newCache.cache);
