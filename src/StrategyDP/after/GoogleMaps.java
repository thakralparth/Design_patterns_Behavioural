package StrategyDP.after;

import StrategyDP.after.pathcalculatorstrategy.PathCalculatorStrategy;
import StrategyDP.after.pathcalculatorstrategy.PathCalculatorStrategyFactory;

public class GoogleMaps {
    public void findPath(String from, String to, Mode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory.getStrategy(mode);
        pathCalculatorStrategy.findPath(from, to);


        // Here we have solved SRP, OCP
        // Clints code is now looking much more simpler

        // Adapter vs Strategy
        // Adapter is structural, it is used when you are talking to 3rd party codebase(library)
        // Strategy is behavioural, it is used when there are multiple ways to do something such that codebae is structured
        // factory is creational, it used when we need to create cobject on a specific subclass
    }
}
