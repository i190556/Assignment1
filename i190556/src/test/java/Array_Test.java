

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array_Test 

{

	
	
	@Test
	void Arr_Test1() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(6, 0);
		Arr_obj.insert(2, 1);
		Arr_obj.insert(3, 2);
		Arr_obj.insert(7, 3);
		Arr_obj.insert(1, 4);
		
		
		
		Arr_obj.display();
		
		
		assertEquals(true ,Arr_obj.binarySearch(3, 1, 4));
		
		
		
		
		
	}
	
	
	
	
	@Test
	void Arr_Test2() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(3, 0);
		Arr_obj.insert(5, 1);
		Arr_obj.insert(2, 2);
		Arr_obj.insert(7, 3);
		Arr_obj.insert(1, 4);
		
		
		
		Arr_obj.display();
		
		
		assertEquals(false ,Arr_obj.binarySearch(1, 0, 3));
		
		
		
		
		
	}
	
	
	
	
	
	
	@Test
	void Arr_Test3() 
	
	{
		Array Arr_obj = new Array();
		Arr_obj.insert(1, 0);
		Arr_obj.insert(2, 1);
		Arr_obj.insert(3, 2);
		Arr_obj.insert(4, 3);
		
		Arr_obj.display();
		
		
		assertEquals (true ,Arr_obj.linearSearch(1));
		assertEquals (false ,Arr_obj.linearSearch(9));
	}
	
	
	
	
	

	@Test
	void Arr_Test4() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(7, 0);
		Arr_obj.insert(1, 1);
		Arr_obj.insert(6, 2);
		Arr_obj.insert(4, 3);
		Arr_obj.insert(6, 4);
		
		
		
		Arr_obj.display();
		
		Arr_obj.delete(0);
		
		assertEquals (false ,Arr_obj.linearSearch(7));
		
		
		
		
		
	}
	
	
	@Test
	void Arr_Test5() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(8, 0);
		Arr_obj.insert(6, 1);
		Arr_obj.insert(2, 2);
		Arr_obj.insert(3, 3);
		Arr_obj.insert(5, 4);
		
		Arr_obj.display();
		
		
		int expected_values [] = {2,3,5,6,8};
		
		Arr_obj.bubbleSort();
		
		for (int i=0; i<=4; i++)
		{
		
			assertEquals (expected_values[i],Arr_obj.array[i]);
		}
		
		
	Arr_obj.delete(0);
	
	assertEquals(false,Arr_obj.linearSearch(2));
		
		
		
		
	}
	
	
	@Test
	void Arr_Test6() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(9, 0);
		Arr_obj.insert(2, 1);
		Arr_obj.insert(5, 2);
		Arr_obj.insert(1, 3);
		Arr_obj.insert(4, 4);
		
		Arr_obj.display();
		
		
		
		
		Arr_obj.bubbleSort();
		
		
		
		assertEquals (true ,Arr_obj.binarySearch(4, 0, 4));
	
		
		
		
		
	}
	
	@Test
	void Arr_Test7() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(9, 0);
		Arr_obj.insert(2, 1);
		Arr_obj.insert(5, 2);
		Arr_obj.insert(1, 3);
		Arr_obj.insert(4, 4);
		
		Arr_obj.display();
		
	
		
		assertEquals (false ,Arr_obj.binarySearch(1, 0, 2));
	
		Arr_obj.delete(3);
		
		assertEquals (true ,Arr_obj.linearSearch(4));
		
		
		
		
	}
	
	
	@Test
	void Arr_Test8() 
	
	{
		
		Array Arr_obj = new Array();
		Arr_obj.insert(5, 0);
		Arr_obj.insert(2, 1);
		Arr_obj.insert(3, 2);
		Arr_obj.insert(2, 3);
		Arr_obj.insert(4, 4);
		
		Arr_obj.display();
		
		assertNotEquals (true ,Arr_obj.binarySearch(5, 0, 2));
	
		Arr_obj.bubbleSort();
		
		
		assertEquals (false ,Arr_obj.binarySearch(5, 0, 2));
		
	}
	
	
	
}
