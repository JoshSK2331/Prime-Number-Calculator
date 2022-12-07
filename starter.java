class starter{
	public static void main(String args[]) {
		int C=2;
		boolean Prime=true;
		String Numbers=new String();
		String List=new String();
		int I=0;
		System.out.println("\nPlease wait...");
		while(C<2147483647){
			for(int Counter=2;Counter<C;Counter++){
				if(C%Counter==0){
					Prime=false;
				}
			}
			if(Prime){
				List=new String(C+" ");
				Numbers+=List;
				I++;
			}
			Prime=true;
			C++;
			if(I>=100){
				I=0;
				System.out.print(Numbers);
				Numbers=new String();
			}
		}
	}
}
