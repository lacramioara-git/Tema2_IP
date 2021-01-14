package ro.mta.se.lab.Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * Acesta clasa este clasa principala a testelor.Din aceasta se specifica ce test va fi rulat si va fi terurnat
 * rezultatul din urma rularii testului.
 *
 * @author Runcan Lacramioara
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestWeatherAPI.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());
    }
}
