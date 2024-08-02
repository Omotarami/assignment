public class LeapYear {
    void Year() {
        //	boolean divisible = false;
        int[] years = { 1800, 1900, 2000, 2100, 2200, 2300, 2400, 2600, 2500 };
        for (int i=0;i<years.length;i++){
        //	boolean divisible = false;
        if (years[i] % 4 == 0 &years[i]% 400 == 0 ) {
            System.out.println(years[i] + "is a leap year");			
        } else {
            System.out.println(years[i] + "is not as leap year");
                        
        }
    }
                
}
public static void main(String[] args) {
    LeapYear yp = new LeapYear();
    yp.Year();
}
}
