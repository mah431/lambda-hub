package lambdahub.service;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

	private Service service;
	
	@Before
	public void setup() {
		service = new Service();
	}
	
	@Test
	public void testForEach() {
		service.forEach(Arrays.asList("Mohammed", "Ilyas", "Alisha")); 
	}
	
	@Test
	public void testSum() {
	 assertThat("Incorrect sum returned for {1..5}", service.sumUsingCollector(asList(1, 2, 3, 4, 5)), is(15)); 
	}
	
	@Test
	public void testAverage() { 
		assertThat("Incorrect average returned for {1..6}", service.average(asList(1, 2, 3, 4, 5, 6)), is(3.5));
	}
	
	
	
}
