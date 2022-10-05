package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Name;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class validateTest {


    @Test
    void 이름_5자_이상(){
        assertThrows(IllegalArgumentException.class,()-> new Name("5자이상의이름"));
    }

    @Test
    void 이름_5자_이하(){
        assertThat(new Name("5자이하").getName()).contains("5자이하");
    }
}
