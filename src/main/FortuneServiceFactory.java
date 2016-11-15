package main;

/**
 * User:    mengxin
 * Date:    15/11/16
 * Project: GuiceLearning
 */
public class FortuneServiceFactory {
    private FortuneServiceFactory() {
    }

    private static FortuneService fortuneService = new FortuneServiceImpl();

    public static FortuneService getFortuneService() {
        return fortuneService;
    }

    public static void setFortuneService(FortuneService mockFortuneService) {
        fortuneService = mockFortuneService;
    }
}