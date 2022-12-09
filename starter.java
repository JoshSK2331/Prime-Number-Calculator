import java.util.ArrayList;

class starter{
	public static void main(String args[]) {
		int C=2;
		ArrayList<Integer> Infi=new ArrayList<Integer>();
		Infi.add(2);
		boolean Prime=true;
		String Numbers=new String();
		String List=new String();
		int I=0;
		while(C<2147483647){
			for(int Counter=0;Counter<Infi.size();Counter++){
				if(C%Infi.get(Counter)==0){
					Prime=false;
				}
			}
			if(Prime){
				Infi.add(C);
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
