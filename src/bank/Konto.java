package bank;

public class Konto extends Bank
{

    public Konto(int pengar)
    {
        super(pengar);
    }

    @Override
    public void taut()
    {
        int resultat = this.getBelopp() - 10;
        this.setBelopp(resultat);
        System.out.println(this.getBelopp());

    }
}
