// In a given array of integers shift all occurrences of the
// given number to the end of the array
// if the given number is 5
// eg: [5,10,6,5,5,7,8,9,0,5] -> [0,10,6,9,8,5,5,5,5]
//
// Pseudocode
// function shiftToLast(arr[], number):
//      j = arr.length-1
//      loop i=0 to i=j:
//          if arr[j] == number:
//              j = j-1
//          if arr[i] == number:
//              temp = arr[i]
//              arr[i] = arr[j]
//              arr[j] = temp
//      return arr
//
//  Time complexity : O(N)
//  Space complexity : O(1)

// Implementation

function swap(
  firstIndex: number,
  secondIndex: number,
  arr: number[]
): number[] {
  let temp = 0;
  temp = arr[firstIndex];
  arr[firstIndex] = arr[secondIndex];
  arr[secondIndex] = temp;

  return arr;
}

function shiftToLast(arr: number[], target: number): number[] {
  let j = arr.length - 1;
  let i = 0;
  while (i < j) {
    if (arr[j] === target) {
      --j;
    }
    if (arr[i] === target) {
      arr = swap(i, j, arr);
    }
    ++i;
  }
  return arr;
}

const arr = [5, 10, 6, 5, 5, 7, 8, 9, 0, 5];

const newArr = shiftToLast(arr, 5);

console.log(newArr);
