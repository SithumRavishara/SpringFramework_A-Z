package SpringTesting2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {


    private String[] data = {
            "Day after Tommrrow",
            "Beware of the Dogs",
            "Lazzy Dogs are biten"
    };

    private Random myRandom = new Random();



    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
