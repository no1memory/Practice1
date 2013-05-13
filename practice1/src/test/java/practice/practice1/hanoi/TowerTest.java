package practice.practice1.hanoi;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Ignore;
import org.junit.Test;

public class TowerTest {

	@Test
	public void testTower() {
		Tower tower = new Tower("test");
		assertTrue(tower.isEmpty());
	}

	@Test
	public void testTowerInt() {
		Tower tower = new Tower("test", 5);
		assertFalse(tower.isEmpty());
		for (int i = 0; i < 5; i ++) {
			assertFalse(tower.isEmpty());
			int v = tower.pop();
			assertEquals(i+1, v);
		}
		assertTrue(tower.isEmpty());
	}

	@Test
	public void testTowerIntArray() {
		Tower tower = new Tower("test", new Integer[] {1, 3, 5});
		Integer val = tower.pop();
		assertEquals(1, val.intValue());
		val = tower.pop();
		assertEquals(3, val.intValue());
		val = tower.pop();
		assertEquals(5, val.intValue());
	}

	@Test
	public void testPeek() {
		Tower tower = new Tower("test");
		try {
			Integer val = tower.peek();
			assertNull(val);
		}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
		tower.push(1);
		try {
			Integer val = tower.peek();
			assertFalse(tower.isEmpty());
			assertEquals(1, val.intValue());
		}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
	}

	@Test 
	public void testPop() {
		Tower tower = new Tower("test");
		try {
			tower.pop();
			fail ("”­¶‚·‚×‚«—áŠO‚ª”­¶‚µ‚Ü‚¹‚ñ‚Å‚µ‚½");
		}
		catch (NoSuchElementException e) {}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
		tower = new Tower("test", new Integer[] {5});
		try {
			Integer val = tower.pop();
			assertTrue(tower.isEmpty());
			assertEquals(5, val.intValue());
		}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
	}

	@Test
	public void testPush() {
		Tower tower = new Tower("test");
		try {
			tower.push(1);
		}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");		
		}
		try {
			tower.push(2);
			fail ("”­¶‚·‚×‚«—áŠO‚ª”­¶‚µ‚Ü‚¹‚ñ‚Å‚µ‚½");
		}
		catch (IllegalArgumentException e) {}
		catch (Exception e) {
			fail ("—\Šú‚¹‚Ê—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");	
		}
	}

	@Test
	public void testIsEmpty() {
		Tower tower = new Tower("test");
		assertTrue(tower.isEmpty());
		tower = new Tower("test", 1);
		assertFalse(tower.isEmpty());
	}

	@Test
	public void testToArray() {
		Tower tower = new Tower("test");
		assertArrayEquals(new Integer[] {}, tower.toArray());
		tower = new Tower("test", 5);
		assertArrayEquals(new Integer[] {1,2,3,4,5}, tower.toArray());
		
	}
}
