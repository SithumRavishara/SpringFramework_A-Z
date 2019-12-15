package SpringTesting2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public  TennisCoach(){
        System.out.println("this is default constructor");
    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        System.out.println("this is setter method");
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practise 30min of volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
