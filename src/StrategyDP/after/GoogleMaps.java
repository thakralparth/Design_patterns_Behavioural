package StrategyDP.after;

import StrategyDP.after.pathcalculatorstrategy.PathCalculatorStrategy;
import StrategyDP.after.pathcalculatorstrategy.PathCalculatorStrategyFactory;

public class GoogleMaps {
    public void findPath(String from, String to, Mode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory.getStrategy(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
