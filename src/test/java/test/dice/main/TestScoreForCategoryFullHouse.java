package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryFullHouse extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryFullHouse.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 2, 2, 3, 3, 3  --> 13
	public void test_CATEGORY_ROLL_ON_FULL_HOUSE_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FULL_HOUSE_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FULL_HOUSE, 2, 2, 3, 3, 3);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(13), score);
	}

	@Test
	// test for 2, 3, 2, 3, 3  --> 13
	public void test_CATEGORY_ROLL_ON_FULL_HOUSE_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FULL_HOUSE_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FULL_HOUSE, 2, 3, 2, 3, 3);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(13), score);
	}
	
	@Test
	// test for 3, 4, 5, 1, 2  --> 0
	public void test_CATEGORY_ROLL_ON_FULL_HOUSE_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FULL_HOUSE_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FULL_HOUSE, 3, 4, 5, 1, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
}
