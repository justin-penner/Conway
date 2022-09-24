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
                double value = Math.random()-0.3;
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
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j <20; j++) {
                int cellsNum = testNearbyCells(i, j);
                setCell(i, j, cellsNum);
            }
        }
    }

    public int testNearbyCells(int x, int y) {
        int counter = 0;
        if(x>0 && x<19 && y>0 && y<19) {
            for(int i = -1; i <= 1; i++) {
                for(int j = -1; j <= 1; j++) {
                    if(field[y+j][x+i] == 1) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public void setCell(int i, int j, int cellsNum) {
        switch(cellsNum) {
            case 0 -> field[j][i] = 0;
            case 1 -> field[j][i] = 0;
            case 2 -> field[j][i] = 1;
            case 3 -> field[j][i] = 1;
            default -> field[j][i] = 0;
        }
    }
}
