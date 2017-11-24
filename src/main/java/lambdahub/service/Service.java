package lambdahub.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import org.hamcrest.Matcher;

public class Service {

	
	public void forEach(List<String> data) {
		data.forEach(s -> System.out.println(s));
	}

	public int sumUsingCollector(List<Integer> data) {
				  
		return data.stream().collect(Collectors.summingInt(d->d));
	}
	
	public int sumDouble(List<Integer> data) {
		return Double.valueOf(data.stream().mapToDouble(d->d).sum()).intValue(); 

	}

	public Double average(List<Integer> data) {
		return data.stream().collect(Collectors.averagingInt(d->d));
	}

}
