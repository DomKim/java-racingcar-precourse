package racingcar.domain;

public class Name {
    private final String name;
    public static final String EXCEED_5_CHARACTERS = "이름은 5자를 넘길 수 없습니다.";

    public Name(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException(EXCEED_5_CHARACTERS);
        }
    }

    public String getName() {
        return name;
    }
}
