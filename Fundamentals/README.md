## 1. **(E)** Right Triangle of Stars
   ```
   *
   * *
   * * *
   * * * *
   ```

#### Solution

```java
public class printRightTriangleOfStars {

    public static void printRightTriangleOfStars(int rows) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }

    }

    public static void main(String args[]) {

        printRightTriangleOfStars((6));

    }

}


```

##### Output

```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

```

## 2.**(E)** Inverted Right Triangle of Stars (mirror of Q1 vertically)