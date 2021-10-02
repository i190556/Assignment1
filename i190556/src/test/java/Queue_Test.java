
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Queue_Test 
{

	@Test
	void Q_Test_1() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(1);	
		Q_obj.enqueue(2);	
		Q_obj.enqueue(3);
		Q_obj.enqueue(4);	
		Q_obj.enqueue(5);	
		Q_obj.enqueue(6);	
		
		assertEquals(1,Q_obj.dequeue());
		assertEquals(2,Q_obj.dequeue());
		assertEquals(3,Q_obj.dequeue());
		assertEquals(4,Q_obj.dequeue());
		assertEquals(5,Q_obj.dequeue());
		assertEquals(6,Q_obj.dequeue());
		
		Q_obj.display();
			
	}
	
	
	
	@Test
	void Q_Test2() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(7);	
		Q_obj.enqueue(8);	
		Q_obj.enqueue(2);
		
	
		
		assertEquals(7,Q_obj.dequeue());
		assertEquals(8,Q_obj.dequeue());
		assertEquals(2,Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	
	
	@Test
	void Q_Test_3() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(1);	
		Q_obj.enqueue(2);	
		Q_obj.enqueue(3);
		Q_obj.enqueue(4);	
		Q_obj.enqueue(5);	
		Q_obj.enqueue(6);	
		
		assertNotEquals(6,Q_obj.dequeue());
		assertNotEquals(5,Q_obj.dequeue());
		assertNotEquals(4,Q_obj.dequeue());
		assertNotEquals(3,Q_obj.dequeue());
		assertNotEquals(2,Q_obj.dequeue());
		assertNotEquals(1,Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	
	
	@Test
	void Q_Test4() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(7);	
		Q_obj.enqueue(8);	
		Q_obj.enqueue(2);
		
	
		
		assertNotEquals(1,Q_obj.dequeue());
		assertNotEquals(2,Q_obj.dequeue());
		assertNotEquals(3,Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	
	

	@Test
	void Q_Test5() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(6);	
		Q_obj.enqueue(9);	
		Q_obj.enqueue(5);
		
	
		
		assertSame(6,Q_obj.dequeue());
		assertSame(9,Q_obj.dequeue());
		assertNotEquals(1,Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	

	@Test
	void Q_Test6() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(8);	
		Q_obj.enqueue(2);	
		Q_obj.enqueue(5);
		
	
		
		assertNotSame(5,Q_obj.dequeue());
		assertNotSame(6,Q_obj.dequeue());
		assertEquals(5,Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	
	

	@Test
	void Q_Test7() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(6);	
		Q_obj.enqueue(1);	
		Q_obj.enqueue(3);
		
	
		
		assertTrue(7>Q_obj.dequeue());
		assertTrue(6>Q_obj.dequeue());
		assertTrue(1<Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}
	
	

	@Test
	void Q_Test8() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(5);	
		Q_obj.enqueue(2);	
		Q_obj.enqueue(2);
		
	
		
		assertFalse(1>Q_obj.dequeue());
		assertFalse(0>Q_obj.dequeue());
		assertFalse(4<Q_obj.dequeue());
		
		

		Q_obj.display();
			
	}
	

	@Test
	void Q_Test9() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(8);	
		Q_obj.enqueue(7);	
		Q_obj.enqueue(1);
		
	
		
		assertFalse(1>Q_obj.dequeue());
		assertFalse(0>Q_obj.dequeue());
		assertFalse(4<Q_obj.dequeue());

		Q_obj.display();
		
		
			
	}
	
	
	
	@Test
	void Q_Test_10() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(2);	
		Q_obj.enqueue(0);	
		Q_obj.enqueue(2);
		
	
		
		assertTrue(7>Q_obj.dequeue());
		assertTrue(2>Q_obj.dequeue());
		assertTrue(1<Q_obj.dequeue());
		

		Q_obj.display();
		
			
	}

	
	@Test
	void Q_Test_11() 
	
	{
		Queue Q_obj = new Queue();
							
		Q_obj.enqueue(3);	
		Q_obj.enqueue(4);	
		Q_obj.enqueue(5);
		
	
		
		assertNotNull(Q_obj);
		

		Q_obj.display();
		
			
	}
	
	
	
	
}
