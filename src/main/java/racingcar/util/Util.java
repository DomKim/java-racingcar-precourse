package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

    public static final String SPLITER = ",";

    public static List<String> splitStringIntoList(String carNames) {
        String[] splitedCarNames = carNames.split(SPLITER);
        return Arrays.stream(splitedCarNames).collect(Collectors.toList());
    }

}
