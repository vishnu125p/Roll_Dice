package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryTwoPairs extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryTwoPairs.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 1, 2, 1, 3, 1  --> 0
	public void test_CATEGORY_ROLL_ON_TWO_PAIRS_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_TWO_PAIRS_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_TWO_PAIRS, 1, 2, 1, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test for 2, 2, 1, 3, 1  --> 6
	public void test_CATEGORY_ROLL_ON_TWO_PAIRS_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_TWO_PAIRS_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_TWO_PAIRS, 2, 2, 1, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(6), score);
	}
	
	@Test
	// test for 4, 4, 1, 2, 2  --> 12
	public void test_CATEGORY_ROLL_ON_TWO_PAIRS_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_TWO_PAIRS_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_TWO_PAIRS, 4, 4, 1, 2, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(12), score);
	}

}
