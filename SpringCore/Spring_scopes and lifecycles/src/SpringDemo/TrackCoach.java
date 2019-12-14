package SpringDemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public  TrackCoach(){

    }

    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

    public  void doMyStratupStuffs(){
        System.out.println("Trackcoach: doMyStratupStuffs in the block ");
    }

    public  void  doMyDestroyStuffs(){
        System.out.println("Trackcoach: doMyDestroyStuffs in the block");
    }
}
