package isep.redede;

public class Position {
    public Position(String colomn1, int row1){
        this.colomn = colomn1;
        this.row = row1;

        System.out.println(colomn+row);
    }
    private String colomn;
    private int row;
}
