package sqljoin;

import lombok.Data;

@Data
public class InnerJoinResultSet {
    private int aKey;
    private int bKey;
    private String aFruit;
    private String bFruit;

    public InnerJoinResultSet(int aKey, int bKey, String aFruit, String bFruit) {
        this.aKey = aKey;
        this.bKey = bKey;
        this.aFruit = aFruit;
        this.bFruit = bFruit;
    }

    @Override
    public String toString() {
        return "InnerJoinResultSet{" +
                "aKey=" + aKey +
                ", bKey=" + bKey +
                ", aFruit='" + aFruit + '\'' +
                ", bFruit='" + bFruit + '\'' +
                '}';
    }
}
