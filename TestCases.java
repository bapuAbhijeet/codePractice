import java.util.Scanner;

public class TestCases
{
        private static final String	INDOOR = "INDOOR";
	    private static final String	OUTDOOR = "OUTDOOR";
	    private static final String CONGESTION_TRUE = "True";

        private static boolean checkCongestion(String congestionValue)
        {
            return CONGESTION_TRUE.equals(congestionValue) ? true : false ;
        }

        public static void main(String args[]) 
        {
        //Get Value from GUI {"INDOOR","False","OUTDOOR","False","True"};
        int fwaSelfInd = 1;
		int fwaTechInd = 1;
		int fourGPlusInd = 0;

        String [] networkParameterArray = {"INDOOR","True","OUTDOOR","False","True"};
        String coverage5Gfast = networkParameterArray[0].toUpperCase();
		String congested5Gfast = networkParameterArray[1];
		String coverage5Gwide = networkParameterArray[2].toUpperCase();
		String congested5Gwide = networkParameterArray[3];
		String congested4Gplus = networkParameterArray[4];

        boolean covInd = true ;

        if ( fourGPlusInd > 0 && checkCongestion(congested4Gplus)) 
		{
                covInd = false;
				System.out.println("Not a valid 4g plus address");
		}
		
		if (fwaSelfInd > 0)
		{
			if(OUTDOOR.equals(coverage5Gfast) && OUTDOOR.equals(coverage5Gwide) || 
			   checkCongestion(congested5Gfast) && OUTDOOR.equals(coverage5Gwide) ||
			   checkCongestion(congested5Gfast) && checkCongestion(congested5Gwide) ||
			   OUTDOOR.equals(coverage5Gfast) && checkCongestion(congested5Gwide))
			{
                     covInd = false;
					System.out.println("Not a valid 5g- self address");
			}
		}
		
		if (fwaTechInd > 0)
		{
			if(checkCongestion(congested5Gfast) && INDOOR.equals(coverage5Gwide) ||
				checkCongestion(congested5Gfast) && checkCongestion(congested5Gwide) ||
				checkCongestion(congested5Gfast) && OUTDOOR.equals(coverage5Gwide))
			{
                covInd = false;
				System.out.println("Not a valid 5g address");
			}	
		}

        if (covInd)
        {
            System.out.println("Not blocked");
        }
        }
}