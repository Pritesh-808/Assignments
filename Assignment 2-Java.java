
public class VendingMachine {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MachinePick obj=new MachinePick();
		obj.installItems(10, 10, 10);
		obj.showItems();
		obj.removeItems(1, 2, 3);
		obj.showItems();
		obj.installItems(10, 10, 10);
		obj.showItems();
		obj.removeItems(1, 2, 3);
		obj.showItems();
	}

}

class MachinePick{
	int popcorn=0;
	int soda=0;
	int cookies=0;
	
	void installItems(int popcorn,int soda,int cookies)
	{
		this.popcorn+=popcorn;
		this.soda+=soda;
		this.cookies+=cookies;
		System.out.println("Added "+popcorn+" popcorn packs "+soda+" soda cans "+cookies+" cookies packets;");
		
		
	}
	void showItems() {
		System.out.println("Items left ---------------");
		System.out.println("Popcorn: "+this.popcorn+" soda cans:"+soda+" cookies packets: "+cookies);
	}
	void removeItems(int popcorn,int soda,int cookies)
	{
		this.popcorn-=popcorn;
		this.soda-=soda;
		this.cookies-=cookies;
		System.out.println("Removed "+popcorn+" popcorn packs "+soda+" soda cans "+cookies+" cookies packets;");
		
		
		
	}
	
}
