/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms_lab2;

/**
 *
 * @author Asus
 */
public class MiddleSquare implements Generator 
{
    private int seed;
    private int n_seed;
    
    MiddleSquare(int valueofseed)
    {
        setseedvalue(valueofseed);
        setn_seedvalue(numberdigits(seedvalue()));
    }

    @Override
    public float next() 
    {
        int x;
        x=generatenextnumber(seed,n_seed);
        x=testnumber(x);
        setseedvalue(x);
        return x/(float)Math.pow(10,n_seed);
    }

    @Override
    public int seedvalue() 
    {
        return this.seed;
    }
    
    private void setseedvalue(int value)
    {
        this.seed=value;
    }
    
    private void setn_seedvalue(int value)
    {
        this.n_seed=value;
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
        x=(int)Math.pow(tempseed,2);
        x=(int)x/(int)Math.pow(10,(tempn_seed/2));
        x=x%(int)Math.pow(10,tempn_seed);
        return x;
    }
    
    private int testnumber(int x)
    {
        if(x==0){
            x=x;
        }
        while(numberdigits(x)!=n_seed){
            x=x*10;
        }
        if(seed==generatenextnumber(x,n_seed)){
            x=x+1;           
        }
        return x;        
    }        
}
