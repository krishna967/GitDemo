package examplePrograms;

public class AccountSearchPortal {

	public void duplicateValuesInArr() {
		int[] arr = { 2, 5, 8, 6, 2, 8 };
		for (int i = 0; i < arr.length - 1; i++) {
             //System.out.println(arr[i]);
             if(arr[i]!=arr[i++])
             {
            	 //System.out.println(arr[i]+ ""+arr[i++]+"Duplicates values....");
            	 System.out.println("no duplicates");
            }else if(arr[i]==arr[i++])
                      System.out.println("duplicates in that"+arr[i]);     	 
		}
			
	}

	public static void main(String[] args) {
		AccountSearchPortal asp = new AccountSearchPortal();
		asp.duplicateValuesInArr();
	}
}
