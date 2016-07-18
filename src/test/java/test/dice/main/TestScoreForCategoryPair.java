package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryPair extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryPair.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 1, 2, 1, 3, 1  --> 2
	public void test_CATEGORY_ROLL_ON_PAIR_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_PAIR_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_PAIR, 1, 2, 1, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(2), score);
	}
	
	@Test
	// test for 1, 2, 3, 3, 1  --> 6
	public void test_CATEGORY_ROLL_ON_PAIR_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_PAIR_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_PAIR, 1, 2, 3, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(6), score);
	}

	@Test
	// test for 3, 4, 1, 6, 5  --> 0
	public void test_CATEGORY_ROLL_ON_PAIR_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_PAIR_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_PAIR, 3, 4, 1, 6, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
}
