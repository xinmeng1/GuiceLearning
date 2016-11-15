package main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * User:    mengxin
 * Date:    15/11/16
 * Project: GuiceLearning
 */
public class FortuneServiceImpl implements FortuneService {
    private static final List<String> MESSAGES =
            Arrays.asList(
                    "Today you will have some refreshing juice.",
                    "Larry just bought your company."
            );
    public String randomFortune() {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
