package testNG;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Returntypes {


@Test(dataProvider = "Data1")
public void Data(Object[] s) throws Exception {
	System.out.println(s);
}
	
	        @DataProvider(indices = {1})
			public Iterator<String[]> Data1() {
	        	Set<String[]> data = new HashSet<String[]>();
	        	data.add(new String[] {"partha", "abc", "Apple"});
	        	data.add(new String[] {"PSR", "add", "Dog"});
				return data.iterator();
			};
}
