package pack1;
import java.util.Random; 
public class pager {

int fa=0;
		  public void pagere(int[] a,int b)
		  {
			  int k=0;
			  for(int i=0;i<10;i++)
			  {
				  for(int j=0;j<i;j++)
				  {
					  if(a[i]==a[j])
					  {
						  k=1;
					  }
				  }
				  if(k==0)
				  {
					  fa=fa+1;
				  }
			  }
			  System.out.println("NO of faults is :"+fa);
		  }
		    public static void main(String args[]) 
		    { 
		        // create instance of Random class 
		        Random rand = new Random(); 
		  
		        // Generate random integers in range 0 to 999 
		       int a[] = new int[10];
		        for(int i = 0;i<9;i++) {
		        int rand_int1 = rand.nextInt(10); 
		        a[i]=rand_int1;
		        System.out.println(a[i]);
		        }
		        
		        int frame= rand.nextInt(7); 
		        System.out.println("frame size is :"+frame);
		        if(frame==0) {frame= rand.nextInt(7); }
		        pager ok=new pager();
		        ok.pagere(a,frame);
 } 
		} 


