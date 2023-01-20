package testNG;

import org.testng.annotations.DataProvider;

public class DProviderSep {
	@DataProvider(indices = {0, 1})
	public String[] Data1() {
    	String[] data = new String[] {
    			"parthu",
    			"venkat",
    			"dinesh"
    	};
		return data;
	}

}
