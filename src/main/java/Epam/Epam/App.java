package Epam.Epam;

import java.util.Vector;

/**
 * Hello world!
 *
 */

class Sweets
{
	public String n;
	public int w;
	public int p;
	public int quantity;
	public Sweets(String s,int w, int p ,int q)
	{
		n=s;
		this.w=w;
		this.p=p;
		quantity=q;
	}
	public String getName()
	{
		return n;
	}
	public int getW()
	{
		return w;
	}
	public int getP()
	{
		return p;
	}
	public int getQ()
	{
		return quantity;
	}
}




class Chocolate extends Sweets
{
	 public Chocolate(String name, int w, int p, int quantity) {
	        super(name, w, p, quantity);
	    }
}

class Candy extends Sweets {

    public Candy(String name, int w, int p, int quantity) {
        super(name, w, p, quantity);

    }
}

class Gift {
   public Vector<Sweets> sl;
    int tw;

    public Gift(Vector<Sweets> s2) {
     this.sl = s2;
    }
       
    public int totalWeight()
    {
    	int t=0;
    	for(Sweets s1:sl)
        {
            t+=s1.getW();
        }
        return t;
    }
}
class Children
{
	String name;
    Vector<Gift> g=new Vector<Gift>();

    public Children(String name) {
        this.name = name;
    }
    public void give(Gift gift,Children child)
    {
        child.take(gift);
    }
    public void take(Gift gift)
    {
        g.add(gift);
    }
    public void show()
    {
        System.out.print(this.name+": ");
        for(int i=0;i<g.size();i++)
        {
        	int ans= g.get(i).totalWeight();
            System.out.println(" Total Weight"+ans);
        }
    }
}


public class App 
{
    public static void main( String[] args )
    {
        Children c=new Children("RAM");
        Sweets c1=new Chocolate("eclairs",1,2,6);
        Sweets c2=new Candy("pulse",1,1,100);
        Vector<Sweets> a1=new Vector<Sweets>();
        a1.add(c1);
        a1.add(c2);
        Gift gift1=new Gift(a1);
        c.give(gift1,c);
        c.show();
  
    }
}
