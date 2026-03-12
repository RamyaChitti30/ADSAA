import java.util.Arrays;
class Item{
	int weight,profit;
	double ratio;
	Item(int weight,int profit){
		this.weight=weight;
		this.profit=profit;
		this.ratio=(double)profit/weight;
	}
}
public class GreedyFractionalKnapSack{
	public static double getMaxProfit(Item[] items,int m){
		Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
		double maxProfit=0.0;
		System.out.println("Items placed in the bag: ");
		for(Item item:items){
			if(item.weight<=m){
				maxProfit=maxProfit+item.profit;
				m=m-item.weight;
			}else{
				double fraction=(double)m/item.weight;
				maxProfit=maxProfit+item.profit*fraction;
				break;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args){
		Item[] items={
			new Item(10,60),
			new Item(20,100),
			new Item(30,120)
		};
		int m=50;
		double maxProfit=getMaxProfit(items,m);
		System.out.println("Maximum profit in Knapsack: "+maxProfit);
	}
}
