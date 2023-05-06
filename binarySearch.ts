// Binary search
// Search a given number in a sorted array
//
// Pseudocode
// 1) Take array and value to find as input
// 2) Declare lowerIndex=0
// 3) Declare upperIndex=arr.length
// 4) loop through each element in the array
//   A( Declare middleIndex=lowerIndex + (upperIndex - lowerIndex)/2
//
//   B) check if  value = arr[middleIndex]
//         return middleIndex
//      else if value > arr[middleIndex]
//          lowerIndex = middleIndex + 1
//      else
//          upperIndex = middleIndex - 1
//
//  C) return -1
//
// The time complexity is O(log(N))
// The space complexity is O(1)
//

// Implementation
export function binarySearch(arr: number[], value: number): number {
  let lowerIndex: number = 0;
  let upperIndex: number = arr.length;

  for (let i: number = 0; i < upperIndex; i++) {
    let middleIndex: number = Math.floor(
      lowerIndex + (upperIndex + lowerIndex) / 2
    );

    if (value === arr[middleIndex]) {
      return middleIndex;
    } else if (value > arr[middleIndex]) {
      lowerIndex = middleIndex + 1;
    } else {
      upperIndex = middleIndex - 1;
    }
  }

  return -1;
}

// // Algorithm check
// const arr: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// const value: number = 5;
// const foundIndex: number = binarySearch(arr, value);

// if (foundIndex > 0) {
//   console.log(`The number is present in index ${foundIndex}`);
// } else {
//   console.log("Number is not found in the array");
// }
