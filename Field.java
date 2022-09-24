public class Field {
    public static int FIELD_X = 10;
    public static int FIELD_Y = 10;
    private final int field[][] = new int[FIELD_Y][FIELD_X];

    public int getValueAt(int x, int y) {
        return field[y][x];
    }

    public void setValueAt(int y, int x, int value) {
        field[y][x] = value;
    }

    public void reset() {
        for(int y = 0; y < FIELD_Y; y++) {
            for(int x = 0; x < FIELD_Y; x++) {
                setValueAt(y, x, 0);
            }
        }
    }


}
