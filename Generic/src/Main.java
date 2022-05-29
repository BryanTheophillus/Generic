class Documents<T> {
   private T monthly;
   
	public Documents(T monthly){
		this.monthly = monthly;
	}

	public T getMonthly(){
	       return monthly;
	   }
}

public class Main {
	public static void main(String[] args) {
		Documents<String> bulan = new Documents<>("Mei");
		Documents<Integer> tanggal = new Documents<>(15);
		
		System.out.println(tanggal.getMonthly() + " "+ bulan.getMonthly());
		
	}
	
}
