

public class pancakeNode {
	public int status[];
	public int flip;
	public int g;
	public int h; 
	
	pancakeNode(int status[], int flip, int g, int h){
		this.status = status;
		this.flip = flip;
		this.g= g;
		this.h= h;
	}
	
	public void printNode(pancakeNode n) {
		switch(n.flip) {
			case 1:
			 System.out.println("|"+ n.status[0]+n.status[1]+n.status[2]+n.status[3]+ " g = "+ g+" h = "+h);
			 break;
			case 2:
				System.out.println(n.status[0]+"|"+n.status[1]+n.status[2]+n.status[3]+ " g = "+ g+" h = "+h);
				break;
			case 3:
				System.out.println(n.status[0]+n.status[1]+"|"+n.status[2]+n.status[3]+ " g = "+ g+" h = "+h);
				break;
		}
	}
}
