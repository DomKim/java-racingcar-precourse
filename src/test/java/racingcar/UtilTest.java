package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.util.Util;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class UtilTest {

    @Test
    void 문자열_쉼표_분리(){
        String carNames = "aaa,bbb,ccc";

        List<String> expected = Util.splitStringIntoList(carNames);
        assertThat(expected).containsExactly("aaa","bbb","ccc");
    }
}
