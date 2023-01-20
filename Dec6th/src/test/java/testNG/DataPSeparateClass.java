package testNG;

import org.testng.annotations.Test;

public class DataPSeparateClass {
	
		@Test(dataProvider = "Data1", dataProviderClass = DProviderSep.class )
		public void Data(Object[] s) throws Exception {
			System.out.println(s);
		}

}
