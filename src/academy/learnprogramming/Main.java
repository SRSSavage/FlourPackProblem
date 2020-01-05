package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(goal < 0 || smallCount < 0 || bigCount < 0)
            return false;

        bigCount *= 5;

        if(smallCount == 0 && goal % 5 != 0) return false;

        else if(goal % 5 > smallCount) return false;

        else return (bigCount + smallCount >= goal);

    }
}
