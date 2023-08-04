# A Guide to Passing CSC2004Z

For this guide, I will be splitting it into sections. These are:

* Setting up a Java File
* Receiving Input
* Variable Types
* Arrays
* Loops
* Reading and writing to textfiles.
* String manipulation
* Other

## Setting up a Java File

First, you want to start with the correct format for the file. Yes, I know you're not stupid but I promise you it's an easy mistake to make. Always make sure your class name has the same name as your file>

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

## Converting Types

In my opinion the easiest way to convert from one type to another is to use the `valueOf()` method as it works for both String to int and int to String.

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

## Add Items

To add items to the list we use the `add()` method

```java
ArrayList<String> strings = new ArrayList<String>();

strings.add("text lol");
```


# Reading and Writing to Text File

## Reading from a Text File

To read from a text file you will need to use a method that allows you to take the text file contents as an input. There are multiple ways to do this, however, I highly recommend BufferedReader and FileReader. These work together.

To use these you will need to import them from the java.io library. As mentioned before you can either import the entire library or just the methods you need. Here is an example of importing the whole library:

```java
import java.io.*;

public class FileName{
  public static void main(String[] args){

  }
}
```

To read the contents


