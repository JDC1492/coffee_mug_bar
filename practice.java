import java.util.Arrays; 

public class Practice{
    double time;
    double[] planner = new Array[7];

    public Practice(int time){
        this.time = time;
    }

    public static void main(String[] args){
        //Setting the schedule
        Practice mondayPractice = new Practice(6.00);
        Practice tuesdayPractice = new Practice(6.00);
        Practice wednesdayPractice = new Practice(5.15);
        Practice thursdayPractice = new Practice(5.15);
        planner.add(mondayPractice);
        System.out.println(mondayPractice.time + " PM is when practice will be held.");
        System.out.println("Hello World!");

    }

}