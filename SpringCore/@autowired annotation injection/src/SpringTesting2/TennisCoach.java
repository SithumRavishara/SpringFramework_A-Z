package SpringTesting2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise 30min of volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
