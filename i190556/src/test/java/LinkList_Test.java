

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkList_Test 


{

	@Test
	void LL_Test1() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(7);
		List_obj.pushFront(4);
		List_obj.pushFront(6);
		List_obj.pushFront(5);
		
		int expected_head=5;
		
		assertEquals(expected_head,List_obj.head.key);
		
		List_obj.display();
		
	
	}
	
	

		
	
	


	@Test
	void LL_Test2() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushBack(2);
		List_obj.pushBack(7);
		List_obj.pushBack(5);
		
		
		assertSame(1,List_obj.head.key);
		
		List_obj.display();
		
	
	}
	
	

	@Test
	void LL_Test3() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushBack(2);
		List_obj.pushBack(7);
		List_obj.pushBack(5);
		
		
		
		
		assertSame(1,List_obj.head.key);
		
		List_obj.display();
		
	
	}
	
	
	
	

	@Test
	void LL_Test4() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(7);
		List_obj.pushBack(4);
		List_obj.pushBack(1);
		List_obj.pushBack(5);
		
		
		assertSame(7,List_obj.head.key);
		List_obj.display();
		
		
		List_obj.pop(2);
		assertSame(7,List_obj.head.key);
		List_obj.display();
		
		List_obj.popFront();
	
		assertSame(4,List_obj.head.key);
		List_obj.display();
	
	}
	
	
	

	@Test
	void LL_Test5() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushFront(2);
		List_obj.pushFront(3);
		List_obj.pushFront(4);
		List_obj.pushFront(5);
		List_obj.pushFront(6);
		List_obj.pushFront(7);
		
		
		int expected_values [] = {7,6,5,4,3,2,1};
		
		
		assertEquals(7,List_obj.head.key);
		List_obj.display();
		
		
		for (int i=0; i<=6; i++)
		{
		
			assertEquals(expected_values[i],List_obj.head.key);
			List_obj.popFront();
			List_obj.display();
		}
		
		
		
	}
	
	
	
	
	
	@Test
	void LL_Test6() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(4);
		List_obj.pushFront(6);
		List_obj.pushBack(2);
		List_obj.pushBack(1);
		List_obj.pushFront(9);
		List_obj.pushFront(3);
		List_obj.pushBack(7);
		
		
		int expected_values [] = {3,9,6,4,2,1,7};
		
		
		assertNotEquals(7,List_obj.head.key);
		List_obj.display();
		
		
		List_obj.pop(1);
		assertEquals(3,List_obj.head.key);
		
		List_obj.popFront();
		assertTrue(3<List_obj.head.key);
		
		
		
	}
	
	
	@Test
	void LL_Test7() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(4);
		List_obj.pushFront(6);
		List_obj.pushBack(2);
		List_obj.pushBack(1);
		List_obj.pushFront(9);
		List_obj.pushFront(3);
		List_obj.pushBack(7);
		
		
		int expected_values [] = {3,9,6,4,2,1,7};
		
		
		assertNotEquals(7,List_obj.head.key);
		List_obj.display();
		
		
		List_obj.popFront();

		List_obj.popFront();

		List_obj.popFront();
		
		
		assertFalse(5<List_obj.head.key);
		List_obj.display();
		
		
	}
	
	
	
	@Test
	void LL_Test_8() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushBack(7);
		List_obj.pushBack(6);
		List_obj.pushBack(5);
		List_obj.pushBack(4);
		List_obj.pushBack(3);
		List_obj.pushBack(2);
		List_obj.pushBack(1);
		
		
		
		assertEquals(7,List_obj.head.key);
		List_obj.display();
		
	}
	
	
	
	
	@Test
	void LL_Test_9() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushBack(1);
		List_obj.pushBack(2);
		List_obj.pushBack(3);
		List_obj.pushBack(4);
		List_obj.pushBack(5);
		
		
		
		assertEquals(5,List_obj.size);
		List_obj.display();
		
	}
	
	
	
	
	@Test
	void LL_Test_10() 
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushFront(2);
		List_obj.pushFront(3);
		
		
		assertNotEquals(2,List_obj.size);
		List_obj.display();
		
		
		List_obj.pop(1);
		
		assertEquals(2,List_obj.size);
		List_obj.display();
		
		
	}
	
	
	
	@Test
	void LL_Test_11()
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushFront(2);
		List_obj.pushFront(3);
		List_obj.pushFront(4);
		List_obj.pushFront(5);
		List_obj.pushFront(6);
		
		
		assertTrue(1<List_obj.size);
		List_obj.display();
		
		
		List_obj.popFront();
		List_obj.popFront();
		
	
		assertNotSame(2,List_obj.size);
		List_obj.display();
	
		
	}
	
	
	@Test
	void LL_Test_12()
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(6);
		List_obj.pushFront(2);
		List_obj.pushFront(5);
		List_obj.pushBack(1);
		List_obj.pushFront(7);
		List_obj.pushBack(9);
		
		
		assertTrue(1<List_obj.size);
		List_obj.display();
		
		
		List_obj.popFront();
		List_obj.popFront();
		
	
		assertSame(4,List_obj.size);
		List_obj.display();
	
	
	
		List_obj.pop(1);
		List_obj.pop(2);
	

		assertNotEquals(4,List_obj.size);
		List_obj.display();



		assertEquals(2,List_obj.size);
		List_obj.display();

		
		
	}
	

	

	@Test
	void LL_Test_13()
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushFront(2);
		List_obj.pushFront(3);
		List_obj.pushFront(4);
		List_obj.pushFront(5);
		List_obj.pushFront(6);
		
		
		assertTrue(1<List_obj.size);
		List_obj.display();
		
		
		List_obj.popBack();
		List_obj.popBack();
		
	
		assertNotSame(2,List_obj.size);
		List_obj.display();
	
		
	}
	
	
	
	

	@Test
	void LL_Test_14()
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushBack(2);
		List_obj.pushFront(3);
	
		
		
		List_obj.popBack();
		List_obj.popBack();
		List_obj.popFront();
		
		
	
		assertEquals(0,List_obj.size);
		List_obj.display();
	
		
	}
	
	

	
	@Test
	void LL_Test_15()
	
	{
		LinkedList List_obj = new LinkedList();
		List_obj.pushFront(1);
		List_obj.pushBack(2);
		List_obj.pushFront(3);
		List_obj.pushFront(7);
		List_obj.pushBack(2);
		List_obj.pushFront(5);
	
			
		
		
		List_obj.popBack();
		List_obj.popBack();
		List_obj.popBack();

		
	
		assertNotNull(List_obj);
		List_obj.display();
	
		
	}
	
	
	
	
}
