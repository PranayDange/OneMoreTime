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

4) subString
String str = "Hello, World!";
String substr = str.substring(7); // Extracts "World!"
String substr = str.substring(-5); // Equivalent to str.substring(str.length() - 5)
String substr = str.substring(7, 12); // Extracts "World"
String substr = str.substring(7, 12); // Extracts "World"

5) trim
String str = "   Hello, world!   ";
String trimmedStr = str.trim();
System.out.println(trimmedStr); // Output: "Hello, world!"
String str = "\t\tHello, World!\t\t";
String trimmedStr = str.trim();
System.out.println(trimmedStr); //output : Hello, World!
String filePathWithSpaces = "   /path/to/file.txt   ";
String trimmedFilePath = filePathWithSpaces.trim();
output
Original file path:    /path/to/file.txt   
Trimmed file path: /path/to/file.txt

6) append
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("world");
System.out.println(sb.toString());//output :Hello world

StringBuilder sb = new StringBuilder();
sb.append('A');
sb.append('B');
sb.append('C');
System.out.println(sb.toString());//output : ABC

7) indexOf