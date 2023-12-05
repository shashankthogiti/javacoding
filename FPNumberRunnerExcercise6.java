package shashank.functional.programming;

import java.util.List;

public class FPNumberRunnerExcercise6 { // getting maximum value from list

	public static void main(String[] args) {
		List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();// output is = 53
	}

}
//jshell> List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).
//equals(
//filter( 
//flatMap(
//get() 
//getClass() 
//hashCode()
//ifPresent(
//ifPresentOrElse(
//isEmpty()     
//isPresent() 
//map(  
//notify()
//notifyAll()
//or(     
//orElse(  
//orElseGet(  
//orElseThrow( 
//stream()
//toString()  
//wait(
//jshell> List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get()
//$17 ==> 53
