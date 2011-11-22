import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import manga.Bike;
import manga.BikeTypes;
import manga.Wyjatek;

public class BikerTest {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}


@AfterClass
public static void tearDownAfterClass() throws Exception {
}

@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}


@Test
public void testAddBike() {
fail("Not yet implemented"); // TODO
}

@Test
public void testPrintBikes() {
fail("Not yet implemented"); // TODO
}

@Test
public void testBiker() {
fail("Not yet implemented"); // TODO
}

@Test
public void testDeleteBike() {
fail("Not yet implemented"); // TODO
}


@Test
public void testFindBike() {
fail("Not yet implemented"); // TODO
}



@Test(expected=Wyjatek.class, timeout=100)
public void testException() throws Wyjatek
{
new Bike(BikeTypes.Full,"").setPrize(-40.0);
}
}
