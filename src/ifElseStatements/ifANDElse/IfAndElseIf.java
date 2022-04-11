package ifElseStatements.ifANDElse;

public class IfAndElseIf {
        public static void main(String[] args) {

        /*
        Write a program that creates 3 random numbers
        between 45-90. Print out the numbers' max, min,
        and the median.
        
        Use logical  (&&) and relational (!=)
         */

            int var1 = (int) (Math.random() * 46) + 45, var2 = (int) (Math.random() * 46) + 45,
                    var3 = (int) (Math.random() * 46) + 45;

            // Write Math.max and Math.min as functions of each other to get results with less code
            int max = Math.max(Math.max(var1, var2), var3);
            int min = Math.min(Math.min(var1, var2), var3);
            int median;

            // else if is used here so that the loop doesn't end. else by itself will always end the loop
            if (var1 != max && var1 != min){            // var1 median possibility
                median = var1;
            }
            else if (var2 != max && var2 != min){        // var2 median possibility
                median = var2;
            }
            else {                                       // var3 median possibility
                median = var3;
            }

            System.out.println("The first number generated = " + var1 +
                             "\nThe second number generated = " + var2 +
                             "\nThe third number generated = " + var3 +
                             "\nThe max of the generated numbers = " + max +
                             "\nThe min of the generated numbers = " + min +
                             "\nThe median of the generated numbers = " + median
            );
        }
    }
