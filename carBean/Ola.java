package carBean;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			Sedan sd=new Sedan();
			return sd;
		}
		HatchBack hb=new HatchBack();
		return hb;
	}

	public int calculateBill(Car car) {
		HatchBack hb1= new HatchBack();
		int total1=car.getNumberOfPassenger()*hb1.farePerKm;
		
		return total1;
//		Sedan sd=(Sedan)car;
//		int total=car.getNumberOfPassenger()*sd.farePerKm;
//		
//		return total;
	}
}