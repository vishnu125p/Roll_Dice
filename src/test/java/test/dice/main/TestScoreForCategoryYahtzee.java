package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryYahtzee extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryYahtzee.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 2, 2, 2, 2, 2  --> 50
	public void test_CATEGORY_ROLL_ON_YAHTZEE_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_YAHTZEE_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_YAHTZEE, 2, 2, 2, 2, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(50), score);
	}
	
	@Test
	// test for 1, 2, 3, 4, 5  --> 0
	public void test_CATEGORY_ROLL_ON_YAHTZEE_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_YAHTZEE_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_YAHTZEE, 1, 2, 3, 4, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test for 5, 5, 5, 5, 5  --> 50
	public void test_CATEGORY_ROLL_ON_YAHTZEE_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_YAHTZEE_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_YAHTZEE, 5, 5, 5, 5, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(50), score);
	}

}
