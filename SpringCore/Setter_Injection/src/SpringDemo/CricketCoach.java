package SpringDemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailaddress;
    private String teame;

    public CricketCoach(){
        System.out.println("No-arg constructor");
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getTeame() {
        return teame;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
        System.out.println("In the setter method - setemailaddress");
    }

    public void setTeame(String teame) {
        this.teame = teame;
        System.out.println("In the setter method - setteam");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("In the setter method - setfortuneservice");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Daily Bowling Fast 20min";
    }
}
