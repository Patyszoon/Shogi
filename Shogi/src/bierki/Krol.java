package bierki;

public class Krol extends Bierka{

    protected Krol(Kolor kolor, Stan stan, int wiersz, int kolumna) {
        super(kolor, stan, wiersz, kolumna);
    }

    @Override
    public boolean czyLegalny(int x, int y) {
        if((x >= this.kolumna-1) &&(x <= this.kolumna+1)){
            if((y >= this.wiersz-1) &&(y <= this.wiersz+1)){
                return true;
            }
        }
        return false;
    }
}
