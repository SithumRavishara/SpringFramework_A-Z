package SpringDemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Doing 30mins batting practices";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
