import math

def solution(inputArray):
    largest_product = int("-inf")
    
    for index in range(len(inputArray) - 1):
        if largest_product < inputArray[index] * inputArray[index + 1]:
            largest_product = inputArray[index] * inputArray[index + 1]
    
    print(largest_product)
    
solution([-23, 4, -3, 8, -12])