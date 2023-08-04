# A Guide to Passing CSC2004Z

For this guide, I will be splitting it into sections. These are:

* Setting up a Java File
* Receiving Input
* Variable Types
* Reading and writing to textfiles.
* String manipulation
* Loops
* Arrays
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

To receive input from your keyboard you will need to use a Scanner. To use scanner you will need to import the java.util library. I recommend you import the entire library as you might use other things from it.

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

Now, to use the scanner we will need to initialise it to take the keyboard input: (nb: i prefer to call my Scanner keyboard but you can call it whatever you like)

```java
Scanner keyboard = new Scanner(System.in);
```


