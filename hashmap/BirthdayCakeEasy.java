import java.util.HashMap;
import java.util.List;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer, Integer> candlesMap = new HashMap<Integer, Integer>();
        int greater = 0;
        for (int index = 0; index < candles.size(); index++){
            int currentValue = candles.get(index);
            candlesMap.put(currentValue, candlesMap.getOrDefault(currentValue, 0) + 1);
            if( greater < currentValue ){
                greater = currentValue;
            }
        }
        return candlesMap.get(greater);
    }

}