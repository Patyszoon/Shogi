package bierki;

public class Wieza extends PromowalnaBierka{


    protected Wieza(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }


    @Override
    protected boolean czyLegalnyPrzedPromocja(int x, int y) {
        return false;
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int x, int y)
    {
        return false;
    }
}
