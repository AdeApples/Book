# Python Utility Functions
# Common helper functions for everyday coding

# ========== EVEN/ODD FUNCTIONS ==========

def is_even(number):
    """
    Check if a number is even.
    
    Args:
        number: The number to check
    
    Returns:
        True if even, False if odd
    """
    return number % 2 == 0


def is_odd(number):
    """
    Check if a number is odd.
    
    Args:
        number: The number to check
    
    Returns:
        True if odd, False if even
    """
    return number % 2 != 0


# ========== STRING FUNCTIONS ==========

def reverse_string(text):
    """
    Reverse a string.
    
    Args:
        text: The string to reverse
    
    Returns:
        The reversed string
    """
    return text[::-1]


def count_vowels(text):
    """
    Count the number of vowels in a string.
    
    Args:
        text: The string to check
    
    Returns:
        The number of vowels
    """
    vowels = "aeiouAEIOU"
    count = 0
    for letter in text:
        if letter in vowels:
            count += 1
    return count


# ========== MATH FUNCTIONS ==========

def factorial(n):
    """
    Calculate the factorial of a number.
    
    Args:
        n: The number (must be positive)
    
    Returns:
        The factorial of n
    """
    if n < 0:
        return "Error: Number must be positive"
    elif n == 0 or n == 1:
        return 1
    else:
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result


def find_max(numbers):
    """
    Find the maximum number in a list.
    
    Args:
        numbers: A list of numbers
    
    Returns:
        The largest number in the list
    """
    if len(numbers) == 0:
        return None
    max_num = numbers[0]
    for num in numbers:
        if num > max_num:
            max_num = num
    return max_num


def find_min(numbers):
    """
    Find the minimum number in a list.
    
    Args:
        numbers: A list of numbers
    
    Returns:
        The smallest number in the list
    """
    if len(numbers) == 0:
        return None
    min_num = numbers[0]
    for num in numbers:
        if num < min_num:
            min_num = num
    return min_num


# ========== EXAMPLES ==========
# Uncomment to test:

# print(is_even(4))  # True
# print(is_odd(7))  # True
# print(reverse_string("hello"))  # "olleh"
# print(count_vowels("hello world"))  # 3
# print(factorial(5))  # 120
# print(find_max([3, 7, 2, 9, 1]))  # 9
# print(find_min([3, 7, 2, 9, 1]))  # 1
