
public class pizzaprice {
	private int price;
	private boolean veg;
	private int   add_extra_chess=100;
	private int  add_extra_toppping =200;
	private int  takeaway=10;
	public pizzaprice(boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
		
	}
	public void getpizzaprice()
	{
		System.out.println("           veg pizza"+this.price);
		
	}
	public void add_extra_chess() {
		System.out.println("			Add extra chess"+  ":"+  add_extra_chess)   ;
		this.price+=add_extra_chess;
		
		
		
    }
	    
	
	
	public void add_extra_toppping() {
		System.out.println("			add topping"+  ":"+    add_extra_toppping);
		this.price+=add_extra_toppping;
		
		
		
	}
	
	
	
public void take_away() {
	System.out.println("			bag"+  ":"+    takeaway);
	this.price+=takeaway;
	
	
}


public void getbill() {
	System.out.println("----------------------------------------------");
	
	System.out.println("			totel ammount " + this.price);
	
}
public void dispaly()
{
	System.out.println("----------------------------------------------");
	System.out.print("			Thanks			 \n			Have a nice day\n");
}
}