package bank;

public abstract class Bank
{

    private int belopp;
    private int summa;

    public int getBelopp() {
        return belopp;
    }

    public void setBelopp(int belopp) {
        this.belopp = belopp;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public Bank(int pengar)
    {
        this.belopp = pengar;
    }

    public abstract void taut();

}
