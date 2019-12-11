package SpringDemo;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Doing 30mins batting practices";
    }
}
