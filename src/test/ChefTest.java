package test;

import main.Chef;
import main.FortuneService;
import main.FortuneServiceFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User:    mengxin
 * Date:    15/11/16
 * Project: GuiceLearning
 */
public class ChefTest {
    @Test
    public void makeFortuneCookie() {
        final FortuneService original =
                FortuneServiceFactory.getFortuneService();
        try {
            FortuneServiceMock mock = new FortuneServiceMock();
            FortuneServiceFactory.setFortuneService(mock);
            Chef chef = new Chef();
            chef.makeFortuneCookie();
            assertTrue(mock.calledOnce());
        } finally {
            FortuneServiceFactory.setFortuneService(original);
        }
    }

    private class FortuneServiceMock implements FortuneService {
        private int invocationCount;

        public String randomFortune() {
            invocationCount++;
            return "MOCK";
        }

        public boolean calledOnce() {
            return invocationCount == 1;
        }
    }
}