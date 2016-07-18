package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryLargeStraight extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryLargeStraight.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 2, 3, 4, 5, 6  --> 20
	public void test_CATEGORY_ROLL_ON_LARGE_STRAIGHT_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_LARGE_STRAIGHT_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_LARGE_STRAIGHT, 2, 3, 4, 5, 6);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(20), score);
	}
	
	@Test
	// test for 1, 2, 3, 4, 5  --> 0
	public void test_CATEGORY_ROLL_ON_LARGE_STRAIGHT_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_LARGE_STRAIGHT_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_LARGE_STRAIGHT, 1, 2, 3, 4, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test for 2, 2, 3, 5, 6  --> 0
	public void test_CATEGORY_ROLL_ON_LARGE_STRAIGHT_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_LARGE_STRAIGHT_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_LARGE_STRAIGHT, 2, 2, 3, 5, 6);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}

}
