public class Sales
{
	private int aSeat;
	private int bSeat;
	private int cSeat;
	private double aPrice;
	private double bPrice;
	private double cPrice;

	public Sales( int seata, int seatb, int seatc, double pricea, double priceb, double pricec)
	{
		aSeat = seata;
		bSeat = seatb;
		cSeat = seatc;
		aPrice = pricea;
		bPrice = priceb;
		cPrice = pricec;
	
	}

	public void setaSeat ( int seata )
	{
		aSeat = seata;
	}

	public int getaSeat ()
	{
		return aSeat;
	}

	public void setbSeat ( int seatb )
	{
		bSeat = seatb;
	}

	public int getbSeat ()
	{
		return bSeat;
	}

	public void setcSeat ( int seatc )
	{
		cSeat = seatc;
	}

	public int getcSeat ()
	{
		return cSeat;
	}

	public void setaPrice ( double pricea )
	{
		aPrice = pricea;
	}

	public double getaPrice ()
	{
		return aPrice;
	}

	public void setbPrice ( double priceb )
	{
		bPrice = priceb;
	}

	public double getbPrice ()
	{
		return bPrice;
	}

	public void setcPrice ( double pricec )
	{
		cPrice = pricec;
	}

	public double getcPrice ()
	{
		return cPrice;
	}

	public void displaySales() 
	{
		System.out.println(" No.of seats A 		: " + getaSeat() );
		System.out.println(" Price of A type Seat	: " + getaPrice () );
		System.out.println(" No.of seats B 		: " + getbSeat() );
		System.out.println(" Price of B type Seat	: " + getbPrice () );
		System.out.println(" No.of seats C 		: " + getcSeat() );
		System.out.println(" Price of C type Seat	: " + getcPrice () );
		System.out.println(" Total Sales		: " + (getaSeat() * getaPrice () + getbSeat() * getbPrice () + getcSeat() * getcPrice () ));
	}	
}

	