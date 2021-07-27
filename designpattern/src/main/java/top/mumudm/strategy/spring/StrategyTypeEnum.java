package top.mumudm.strategy.spring;

public enum StrategyTypeEnum {

    A("a"),
    B("b"),
    C("c")
    ;

    private String type;


    private StrategyTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
