package bierki;

public class Wieza extends PromowalnaBierka {


    protected Wieza(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }


    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return (x == this.kolumna) || (y == this.wiersz);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y) {
        int[][] mozliwe = {{-1, 1},   /*{0,  1},*/  {1, 1},
                /* {-1, 0} ,{0,  0}, {1, 0},*/
                {-1, -1}, /*{0, -1}, */{1, -1}};
        for (int[] ints : mozliwe) {
            if (((wiersz + ints[0]) == x) && ((kolumna + ints[1]) == y)) return true;
        }
        return false;
    }
}
