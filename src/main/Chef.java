package main;

/**
 * User:    mengxin
 * Date:    15/11/16
 * Project: GuiceLearning
 */
public class Chef {
    private FortuneService fortuneService;

    public Chef() {
        this.fortuneService = FortuneServiceFactory.getFortuneService();
    }

    public void makeFortuneCookie() {
        new FortuneCookie(fortuneService.randomFortune());
    }
}