public class Field {
    public static int FIELD_X = 20;
    public static int FIELD_Y = 20;
    private final int field[][] = new int[FIELD_Y][FIELD_X];

    public int getValueAt(int x, int y) {
        return field[y][x];
    }

    public void setValueAt(int y, int x, int value) {
        field[y][x] = value;
    }

    public void reset() {
        for(int y = 0; y < FIELD_Y; y++) {
            for(int x = 0; x < FIELD_X; x++) {
                setValueAt(y, x, 0);
            }
        }
    }

    public int[][] fillField() {
        for(int x = 0; x < FIELD_X; x++) {
            for(int y = 0; y < FIELD_Y; y++) {
                double value = Math.random()-0.2;
                if(value > 0.5) {
                    field[y][x] = 1;
                }
            }
        }
        return field;
    }

    public void printField() {
        for(int y = 0; y < FIELD_Y; y++) {
            for(int x = 0; x < FIELD_Y; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println("");
        }
    }

    public boolean isThereLife() {
        for(int y = 0; y < FIELD_Y; y++) {
            for(int x = 0; x < FIELD_Y; x++) {
                if(field[y][x]==1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void renderNew() {
        
    }

    // public boolean testNearbyCells(int x, int y) {

    // }


}
