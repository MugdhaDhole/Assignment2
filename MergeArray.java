package assignment2;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,8,9};
		 int b[]={15,3,7,12};
		 int c[]=new int[a.length+b.length];
		 int count=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 c[i]=a[i];
			 count++;
		 }
		 
		 for(int j=0;j<b.length;j++)
		 {
			 c[count]=b[j];
			 count++;
		 }
		 
		 for(int k=0;k<c.length;k++)
		 {
			 System.out.print(c[k]+" ");
		 }
	}

}
