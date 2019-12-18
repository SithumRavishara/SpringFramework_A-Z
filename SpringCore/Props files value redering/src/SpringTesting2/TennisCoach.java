package SpringTesting2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("tennisCoach")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public  TennisCoach(){
        System.out.println("this is default constructor");
    }

    //define my init method

    @PostConstruct
    public void domyinitStuff(){
        System.out.println("Init method");
    }

    //define my destroy method
    @PreDestroy
    public void domydestroyStuff(){
        System.out.println("Destroy method");
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
