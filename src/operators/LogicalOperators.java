package operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // both true
        boolean interviewQuestionsSent1 = true;
        boolean javaProgramSent1 = true;

        // 1 true, 1 false
        boolean interviewQuestionsSent2 = false;
        boolean javaProgramSent2 = true;

        boolean interviewQuestionsSent3 = true;
        boolean javaProgramSent3 = false;

        // both false
        boolean interviewQuestionsSent4 = false;
        boolean javaProgramSent4 = false;

        // If any true in OR operators, then output will always be true
        // OR Logical Operators (|/||) -- (||) is faster than (|) since it only checks 1 value while | checks both

        System.out.println("The student is okay if they send the interview questions OR the Java homework.");

        System.out.println("Is the student okay?: " + (interviewQuestionsSent1 || javaProgramSent1));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent2 || javaProgramSent2));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent3 || javaProgramSent3));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent4 || javaProgramSent4));
        System.out.println();

        // If any false in AND operators, then output will always be false
        // AND Logical Operators (&/&&) -- (&&) is faster than (&) since it only checks 1 value while | checks both

        System.out.println("The student is okay if they send the interview questions AND the Java homework.");

        System.out.println("Is the student okay?: " + (interviewQuestionsSent1 && javaProgramSent1));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent2 && javaProgramSent2));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent3 && javaProgramSent3));
        System.out.println("Is the student okay?: " + (interviewQuestionsSent4 && javaProgramSent4));
        System.out.println();
    }
}
