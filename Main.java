// PARTNER NAME: Conal Hamilton
// CS111 SECTION #: 1112
// DATE: 2 March 2025
public class Main 
{
  public static void main(String[] args) 
	{
		//System.out.println(calcJulianDate(3,2,2025)); //Test for today's date, should return 2460737
		//System.out.println(calcJulianDate(8,26,1918)); //Test for Katherin Johnson's birthday, should return 2421832
		//System.out.println(calcJulianDate(11,7,1917)); //Test for another day, should return 2421540
		
  }
  public static int calcJulianDate(int monthToday, int dayToday, int yearToday)
  {
	int aVar = (14 - monthToday) / 12; //Establishing necessary calculating variables
	int yearVar = yearToday + 4800 - aVar; //Same as above
	int monthVar = monthToday + (12 * aVar) - 3; //Same as above
	int julianDay = dayToday + (monthVar * 153 + 2) / 5 + yearVar * 365 + yearVar / 4 - yearVar / 100 + yearVar / 400 - 32045; //Formula taken from Lab 03
	return julianDay; //Gives back JDN as an integer
  }
