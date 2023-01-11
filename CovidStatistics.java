
/*
 * File name: CovidStatistic.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: lab02
 * Date: 2022-09-14
 * Professor: Hesham Saadawi 
 * Purpose: this class is used for javadoc documentation, uses 2d array and nested for loop to show formatted output
 * Class list: there is only one class for this lab
 */

/**
* This class is designed to show covid statistics for each provinces in Canada over 8 months' time. 
* Uses nested for loops to display a table of each provinces number over 8 months.
* Uses another nested for loop to summarize the total number of each months' number.
* Uses printf format to format the result.
* @author Bing Xie
* @version 1.0
* @see java.lang.Object
* @since 11.0.15, 2022-09-14
*/

public class CovidStatistics
{
/**Only main method used with no return
 * @param args passes arguments 
 */	
	
public static void main(String[] args)
 
/**two two dimensional array, one contains statistics and one contains the provinces
 * @value final variable ROWS and COLUMNS
 * 
 */
{
   final int ROWS = 7;
   final int COLUMNS = 8;
 
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("              Month     Feb    March    April   May     June    July    Aug     Sept");
   System.out.println();

   /**  
   * uses nested for loop to display the table of statistics of each provinces across the eight months period.
   * uses printf to format the output.
   * 
   */
   for(int i=0; i<ROWS;i++) {
		System.out.printf("%20s",provinces[i]);
		for (int j=0;j<COLUMNS; j++) {
		System.out.printf("%8d",patients[i][j]);
		}
		System.out.println();
	}
	

   /**
   * Print the column sum using printf. Check the sample output file (SpiceOutput) to see the expected pattern.
   * uses for loop to summarize the data of each month's total for all provinces and format the output to match the display.
   */ 
  
   System.out.println();
   System.out.print("   Recovered Patients");
   
   for(int i=0; i<COLUMNS;i++) {
	   int sum=0;
		for (int j=0;j<ROWS; j++) {
		sum+=patients[j][i];
		
		}
		System.out.printf("%8d",sum);
	}
   
   // TO DO: INSERT CODE HERE FOR THIS SECTION!!! Check the sample output file (SpiceOutput) to see the expected pattern.
   //The above was placed, but there is no info needed at this part as the output so far matches the sample.
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}
}
