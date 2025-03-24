package bierki;

public class Wieza extends PromowalnaBierka{


    protected Wieza(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }


    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y)
    {
        return false;
    }

    @Override
    public boolean czyLegalny(int x, int y)
    {
        if(promowana)
        {
            if(czyLegalnyPoPromocji(x, y)) return true;
        }
        if ((x == this.kolumna) || (y == this.wiersz))
        {
                return true;
        }
        return false;
    }
}
