package SpringTesting2;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theForthuneService){
        fortuneService = theForthuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Daily 100m in freestyle";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
