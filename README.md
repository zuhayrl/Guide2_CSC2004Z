# A Guide to Passing CSC2004Z

For this guide, I will be splitting it into sections. These are:

* [Setting up a Java File](#Setting-up-a-Java-File)
* [Receiving Input](#Receiving-Input)
* [Variable Types](#Variable-Types)
* [Arrays](#Arrays)
* [Loops](#Loops)
* [Reading and Writing to Text Files](#Reading-and-Writing-to-Text-File)
* [String Manipulation](#String-Manipulation)
* Maps, Matrices, and 2D Arrays
* Other

## Setting up a Java File

First, you want to start with the correct format for the file. Yes, I know you're not stupid but I promise you it's an easy mistake to make. Always make sure your class name has the same name as your file.

Here is an example using "FileName" as the file name.

```java
public class FileName{
  public static void main(String[] args){

  }
}
```

## Receiving Input

To receive input from your keyboard you will need to use a Scanner. To use scanner you will need to import the `java.util` library. I recommend you import the entire library as you might use other things from it.

To import the library do the following:

```java
import java.util.*;

public class FileName{
  public static void main(String[] args){

  }
}
```

Alternatively, you can just import the Scanner class:

```java
import java.util.Scanner;

public class FileName{
  public static void main(String[] args){

  }
}
```

As you can see we put imports before the classes.

Now, to use the scanner we will need to initialise it to take the keyboard input: (nb: I prefer to call my Scanner keyboard but you can call it whatever you like)

```java
Scanner keyboard = new Scanner(System.in);
```

Now to assign the input from the Scanner to a string variable we do the following:

```java
String inputtedText;
inputtedText = keyboard.nextLine();
```

There are other methods you can use instead of `nextLine()` but I prefer `nextLine()` as it takes all the text until you press enter.

# Variable Types

During the test, you will deal with multiple variable types, mainly `String`, `int`, and `boolean`.

Initialising these can be done as follows:

```java
String word;
int number;
boolean choice; //nb the default state for a boolean is false
```

## Converting Between Types

In my opinion, the easiest way to convert from one type to another is to use the `valueOf()` method as it works for both String to int and int to String.

```java
//String to int
String word = "100";
int num = Integer.valueOf(word);

//int to String
int num = 100;
String word = String.valueOf(num);
```

# Arrays

During the test, you will most likely need to use a type of array. I highly recommend `ArrayList` as it's extremely easy to use. You will need to import the `java.util` library (as shown here)

To create an array we do the following:

```java
//String Array
ArrayList<String> strings = new ArrayList<String>();

//int Array
ArrayList<int> nums = new ArrayList<int>();

//other types
ArrayList<type/class> items = new ArrayList<type/class>();
```

I will be using the ArrayList called **strings** in the next few examples.

## Add Items

To add items to the list we use the `add()` method:

```java
strings.add("text lol");
```

## Get Item

To get a specific item in the list we use the `get()` method:

```java
strings.get(0); //returns item at index 0
```

## Set Item

To set a specific item in the list we use the `set()` method:

```java
strings.set(0, "word "); //set item at index 0 to "word"
```

## Remove Item

To remove a specific item in the list we use the `remove()` method:

```java
strings.remove(0); //removes item at index 0
```

To remove all the items in the array we use the `clear()` method:

```java
strings.clear();
```

## Get Array Size

To get the array size we use the `size()` method:
```java
strings.size();
```

This will return the size of the ArrayList as an integer.

# Loops

## For Loop

The `for` loop loops until a certain condition is met, usually numeric (not a boolean condition).

### Examples

Here we initialise the variable i, then told the loop that it must loop while the value of i is less than or equal to 10, in increments of 1

```java
//loop from 0 to 10
for (int i=0; i<=10; i++){
  //code here
}
```

Here we initialise the variable i, then told the loop that it must loop while the value of i is greater than or equal to 0, in decrements of 1

```java
//loop from 10 to 0
for (int i=10; i>=0; i--){
  //code here
}
```

Here we initialise the variable i, then told the loop that it must loop while the value of i is less than or equal to 10, in increments of 2

```java
//loop from 0 to 10 in twos (0, 2, 4, 6, 8, 10)
for (int i=0; i<=10; i-+2){
  //code here
}
```

## While loops

The `while` loop loops infinitely as long as the specified condition remains `true`:

```java
while(condition){
  //code here
}
```

Example:
This code loops until x equals 5.

```java
int x = 0;

while(x<5){
  x++;
}
```


# Reading and Writing to Text File

## Reading from a Text File

To read from a text file you will need to use a method that allows you to take the text file contents as an input. There are multiple ways to do this, however, I highly recommend `BufferedReader` and `FileReader`. These work together.

To use these you will need to import them from the `java.io` library. As mentioned before you can either import the entire library or just the methods you need. Here is an example of importing the whole library:

```java
import java.io.*;

public class FileName{
  public static void main(String[] args){

  }
}
```

### To read the contents we do the following

**Initialise the `BufferedReader` and `FileReader` types:**

```java
String fileName = textfile.txt;

FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
```

Alternatively, it can be simplified to:

```java
String fileName = textfile.txt;

BufferedReader br = new BufferedReader(new FileReader(fileName));
```

**To read a line from the file we use the `readLine()` method:**

```java
String line;

line = br.readLine(); //br id the BufferedReader as in the previous step
```

**Usually, you would want to read the entire file and be able to put each line in an array for example. This can be done as follows:**

```java
ArrayList<String> lines = new ArrayList<String>();

try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
  String line;
            
  while ((line=br.readLine()) != null){
                lines.add(line);
  }
}
catch(IOException e){System.err.println(e.getMessage());}
```

Here I used a try, catch clause, as Java needs you to catch any errors that may arise from trying to access a text file. You can import the `IOException` class from the `java.io` library.

## Writing to a Text File

To write to a text file you will need to use a method that allows you to edit the contents of the text file. There are multiple ways to do this, however, I highly recommend `BufferedWriter` and `FileWriter`. These work together.

To use these you will need to import them from the `java.io` library. As mentioned before you can either import the entire library or just the methods you need. Here is an example of importing the whole library:

### To write to the file we do the following

**Initialise the `BufferedWriter` and `FileWriter` types:**

```java
String fileName = textfile.txt;

FileWriter fw = new FileWriter(fileName);
BufferedWriter bw = new BufferedWriter(fw);
```

Alternatively, it can be simplified to:

```java
String fileName = textfile.txt;

BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
```

**To write a line to the file we use the `write()` and `newLine()` methods:**

```java
String line;

line = bw.write(); //bw id the BufferedWriter as in the previous step
bw.newLine();
```

**Usually, you would want to write multiple lines, probably from an array. This can be done as follows:**

```java
ArrayList<String> lines = new ArrayList<String>();

lines.add("one"); //adding elements to the array
lines.add("two");
lines.add("three");

try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
  for (int i = 0;i < lines.size();i++){
    bw.write(lines.get(i));
    bw.newLine();
  }
}
catch(IOException e){System.err.println(e.getMessage());}
```

Here I used a try, catch clause, as Java needs you to catch any errors that may arise from trying to access a text file. You can import the `IOException` class from the `java.io` library.

## Appending to a File

To append text to the end of a text file we can make one small change to the `FileWriter`:

```java
//here we enable appending, by setting the second condition of FileWriter to true
FileWriter fw = new FileWriter(fileName,true);
```

# String Manipulation

String manipulation is one of the most important parts of the test. You will need to be able to select certain components within a string, print formatted strings, and more.

**The most important method for string manipulation are `substring()`, `indexOf()` and `length()`.**

## The substring method

The `substring()` method allows you to take a certain part of a string and assign it to a variable:

```java
String line = "hello world :)";

String newLine = line.substring(6,9); //start at index 6 and end at 8 not including 8

//here the variable newLine will have a value of "wor"
//for Strings (and almost everything else the index starts at 0)
//the substring method includes the first number but not the second so here it would be indexes 6, 7, 8
```

With the substring method, you can also select all the text after a certain point, ie, all text from an index till the end of the string:

```java
String line = "hello world :)";

String newLine = line.substring(6); //start at 6 and include everything till the end of the string

//the value of newLine here would be "world :)"
```

## The indexOf method

The `indexOf()` method allows you to find the index of a character in a string.

```java
String line = "hello world :)";

int pos = line.indexOf("o");

//here the value of pos will be 4 as the first instance of "o" is at the fourth index.
```

`indexOf()` can also be used to locate the position of a word in a sentence:

```java
String line = "my name is jeff";

int pos = line.indexOf("is");

//here the value of pos will be 2 as the word "is" is the third word in the string
```

`indexOf()` can also be used to locate the position of a substring in a string:

```java
String line = "mynameisjeff";

int pos = line.indexOf("is");

//here the value of pos will be 6 as the "i" in "is" is located at the 6th index of the string
```

We can also find the second or third, etc index of a letter/substring, etc:

```java
String line = "hello world :)";

int pos = line.indexOf("", line.indexOf("") + 1);
//returns the index of the second occurrence of "o"
```

## The length method

The `length()` method returns the length of a string:

```java
String line = "hello world";
int len = length(line);

//here len will equal 11
```
