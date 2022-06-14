import java.util.Arrays; 

public class Practice{
    double[] planner = new double[4];


    public Practice(double[] scheduele){
        planner = scheduele;
    }

    public static void main(String[] args){
        // double practiceTime;
        // planner[0] = 6.0;
        // planner[1] = 6.0;
        // planner[2] = 5.0;
        // planner[3] = 4.4;
        
        Practice footballPractice = new Practice(planner);
        System.out.println(footballPractice.planner);
        // System.out.println("Hello World!");

    }

}