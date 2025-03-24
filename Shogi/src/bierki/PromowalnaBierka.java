package bierki;

public abstract class PromowalnaBierka extends Bierka{
    boolean promowana = false;

    //przy promocji zmienia status pionka
    public void promocja()
    {
        promowana = true;
    }

    protected abstract boolean czyLegalnyPrzedPromocja(int x, int y);

    //pomocnicza funkcja dla klas, ktore zmieniaja ruch po promocji - domyslnie zaimplementowan ruch jak dla zlotego generala
    protected boolean czyLegalnyPoPromocji(int x, int y)
    {
        boolean legalny = false;
        int[][] mozliwe = {{-1, 1},   {0,  1},  {1, 1},
                           {-1, 0} ,/*{0,  0},*/{1, 0},
                         /*{-1, -1},*/{0, -1},/*{1, -1}*/};
        int k = (kolor == Kolor.BIALY) ? 1 : -1;
        if(promowana)
        {
            for (int[] ints : mozliwe) {
                if (((wiersz + ints[0]) == x) && ((kolumna + ints[1]) == y)) {
                    legalny = true;
                    break;
                }
            }
        }
        return legalny;
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        if(promowana)
        {
            if(czyLegalnyPoPromocji(x, y)) return true;
        }
        return czyLegalnyPrzedPromocja(x, y);
    }

    @Override
    public void zbity()
    {
        promowana = false;
        super.zbity();
    }

    protected PromowalnaBierka(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }
}
