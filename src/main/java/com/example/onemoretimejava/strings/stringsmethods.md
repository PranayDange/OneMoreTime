                                    Strings Methods
1) replace,replaceAll,replaceFirst
- Example
- String replacedStr = str.replace('o', '0');// Output: Hell0, w0rld! //for simple character ''
- String replacedStr = str.replace("world", "Java");// Output: Hello, Java! //for string or word ""
- String replacedStr = str.replaceFirst("apple", "banana");// Output: banana, apple, orange
  String replacedStr = str.replaceAll("fox", "cat");// Output: The quick brown cat jumps over the lazy dog

2) charAt
- char characterAtIndex5 = str.charAt(5);//// Output: Character at index 5:
- str.charAt(str.length() - 1);

3) valueOf
- int intValue = 42;
  String stringValue = String.valueOf(intValue); // Output: String representation of int value: 42
-  double doubleValue = 3.14;
  stringValue = String.valueOf(doubleValue);// Output: String representation of double value: 3.14
