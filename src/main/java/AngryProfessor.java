import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testsCount = in.nextInt();
        for(int test=0; test < testsCount; test++) {
            solveTest(in);
        }
    }

    static void solveTest(Scanner in) {
        int studentsTotal     = in.nextInt();
        int studentsThreshold = in.nextInt();
        int arrivedOk = 0;
        for(int i = 0; i<studentsTotal; i++) {
            int studentTime = in.nextInt();
            if (studentTime<=0) {
                arrivedOk++;
            }
        }
        boolean isCanceled = arrivedOk < studentsThreshold;
        System.out.println(isCanceled ? "YES" : "NO");
    }

}


