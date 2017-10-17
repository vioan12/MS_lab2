/**
 * Created by ioan on 10/17/17.
 */
public class LinearCongruentialGenerator implements Generator {

    private int seed;
    private int interval;
    private int a;
    private int c;
    private int m;

    public float next()
    {
        int x;
        x=generatenextnumber(seed,interval);
        setseedvalue(x);
        return x/(float)Math.pow(10,interval);
    }

    public int seedvalue()
    {
        return this.seed;
    }

    LinearCongruentialGenerator(int valueofseed, int valueofa, int valueofc, int valueofm)
    {
        setseedvalue(valueofseed);
        setavalue(valueofa);
        setcvalue(valueofc);
        setmvalue(valueofm);
        setintervalvalue(numberdigits(valueofm));
    }

    private int numberdigits(int x)
    {
        int n;
        n=0;
        while(x!=0){
            x=x/10;
            n++;
        }
        return n;
    }

    private int generatenextnumber(int tempseed,int tempn_seed)
    {
        int x;
        x=(a*seed+c)% m;
        return x;
    }

    private void setseedvalue(int value)
    {
        this.seed=value;
    }

    private void setintervalvalue(int value)
    {
        this.interval=value;
    }

    private void setavalue(int value)
    {
        this.a=value;
    }

    private void setcvalue(int value)
    {
        this.c=value;
    }

    private void setmvalue(int value)
    {
        this.m=value;
    }
}
