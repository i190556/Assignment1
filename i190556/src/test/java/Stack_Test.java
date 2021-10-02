

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Queue.Queue;

class Stack_Test 

{

	
	
	@Test
	void Stack_Test_1() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(1);	
		S_obj.push(2);	
		S_obj.push(3);
		S_obj.push(4);	
		S_obj.push(5);	
		S_obj.push(6);	
		
		assertEquals(6,S_obj.pop());
		assertEquals(5,S_obj.pop());
		assertEquals(4,S_obj.pop());
		assertEquals(3,S_obj.pop());
		assertEquals(2,S_obj.pop());
		assertEquals(1,S_obj.pop());
		
		S_obj.display();
			
	}
	
	
	
	@Test
	void Stack_Test2() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(7);	
		S_obj.push(8);	
		S_obj.push(2);
		
	
		
		assertEquals(2,S_obj.pop());
		assertEquals(8,S_obj.pop());
		assertEquals(7,S_obj.pop());
		

		S_obj.display();
		
			
	}
	
	
	
	@Test
	void Stack_Test_3() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(1);	
		S_obj.push(2);	
		S_obj.push(3);
		S_obj.push(4);	
		S_obj.push(5);	
		S_obj.push(6);	
		
		assertNotEquals(1,S_obj.pop());
		assertNotEquals(2,S_obj.pop());
		assertNotEquals(3,S_obj.pop());
		assertNotEquals(4,S_obj.pop());
		assertNotEquals(5,S_obj.pop());
		assertNotEquals(6,S_obj.pop());
		

		S_obj.display();
		
			
	}
	
	
	
	@Test
	void Stack_Test4() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(7);	
		S_obj.push(8);	
		S_obj.push(2);
		
	
		
		assertNotEquals(3,S_obj.pop());
		assertNotEquals(2,S_obj.pop());
		assertNotEquals(1,S_obj.pop());
		

		S_obj.display();
		
			
	}
	

	

	@Test
	void Stack_Test5() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(6);	
		S_obj.push(9);	
		S_obj.push(5);
		
	
		
		assertSame(5,S_obj.pop());
		assertSame(9,S_obj.pop());
		assertNotEquals(1,S_obj.pop());
		

		S_obj.display();
		
			
	}

	

	@Test
	void Stack_Test6() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(8);	
		S_obj.push(2);	
		S_obj.push(5);
		
	
		
		assertNotSame(3,S_obj.pop());
		assertNotSame(1,S_obj.pop());
		assertEquals(8,S_obj.pop());
		

		S_obj.display();
		
			
	}
	
	
	



	@Test
	void Stack_Test7() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(7);	
		S_obj.push(2);	
		S_obj.push(9);
		
	
		
		assertFalse(1>S_obj.pop());
		assertFalse(1>S_obj.pop());
		assertFalse(9<S_obj.pop());
		
		

		S_obj.display();
			
	}


	
	

	
	@Test
	void Stack_Test_8() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(6);	
		S_obj.push(4);	
		S_obj.push(7);
		
	
		
		assertTrue(8>S_obj.pop());
		assertTrue(9>S_obj.pop());
		assertTrue(1<S_obj.pop());
		

		S_obj.display();
		
			
	}

	
	@Test
	void Stack_Test_9() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(3);	
		S_obj.push(4);	
		S_obj.push(5);
		
	
		
		assertNotNull(S_obj);
		

		S_obj.display();
		
			
	}
	
	

	
	

	@Test
	void Stack_Test_10() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(1);	
		S_obj.push(5);	
		S_obj.push(8);
		S_obj.push(3);
		S_obj.pop();
		
	
		assertSame(8,S_obj.top());
		
		

		S_obj.display();
		
			
	}
	
	
	

	
	

	@Test
	void Stack_Test_11() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(7);	
		S_obj.push(5);	
		S_obj.push(4);
		
	
		assertNotEquals(3,S_obj.top());
		
		

		S_obj.display();
		
			
	}
	
	
	
	

	@Test
	void Stack_Test_12() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(7);	
		S_obj.push(5);	
		S_obj.push(4);
		
		
		int actual_size = S_obj.getSize();
		int expected_size = 6;
	
		assertNotEquals(expected_size,actual_size);
		
		

		S_obj.display();
		
			
	}
	
	
	
	

	@Test
	void Stack_Test_13() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(1);	
		S_obj.push(2);	
		S_obj.push(3);
		S_obj.push(9);
		S_obj.push(4);
		S_obj.pop();
		S_obj.pop();
		S_obj.pop();
		
		
		

		int actual_size = S_obj.getSize();
		int expected_size = 5;
	
		
		
	
		assertNotEquals(expected_size,actual_size);
		
		

		S_obj.display();
		
			
	}
	
	


	@Test
	void Stack_Test_14() 
	
	{
		Stack S_obj = new Stack();
							
		S_obj.push(5);	
		S_obj.push(8);	
		S_obj.push(3);
		S_obj.push(1);	
		S_obj.push(6);	
		S_obj.push(4);
		S_obj.pop();
		
		
	
		assertFalse(6<S_obj.getSize());
		
		

		S_obj.display();
		
			
	}
	
	
	
	
	
	
	

}
