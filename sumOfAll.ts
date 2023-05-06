// Function that takes array as input and returns the sum of all its values as output

// Pseudocode
// 1) Get integer array as input
// 2) Find the length of the array
// 3) Declare sum=0
// 4) Loop through each element in array until length of the array
//   A) Add value of each index of array into sum
// 5) print the sum
//
// The time complexity for this algorithm is O(N)
// The space complexity for this algorithm is O(1)
//

// General method
export function sumOfAll(arr: number[]) {
  const arrLength: number = arr.length;
  let sum: number = 0;
  for (let i: number = 0; i < arrLength; ++i) {
    sum += arr[i];
  }
  return sum;
}

// Javascript method
export function alterSum(arr: number[]) {
  const sum: number = arr.reduce((sum, arrItem) => sum + arrItem, 0);
  return sum;
}

// // Implementation
// const arr: number[] = [1,2,3,4,5,6,7,8,9,10]
// //sumOfAll(arr)
// alterSum(arr)
