package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class TestScoreFromRollingDice extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreFromRollingDice.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test on number 1s for 1, 2, 1, 3, 1  --> 3
	public void test_CATEGORY_ROLL_ON_NUMBER_1() throws Exception
	{
		logger.info("Inside test_CATEGORY_ROLL_ON_NUMBER_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( 1, ScoreFromRollingDice.CATEGORY_ROLL_ON_NUMBER, 1, 2, 1, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(3), score);
	}
	
	@Test
	// test on number 1s for 2, 2, 6, 5, 2  --> 0
	public void test_CATEGORY_ROLL_ON_NUMBER_2() throws Exception
	{
		logger.info("Inside test_CATEGORY_ROLL_ON_NUMBER_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( 1, ScoreFromRollingDice.CATEGORY_ROLL_ON_NUMBER, 2, 2, 6, 5, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test on number 2s for 2, 2, 6, 5, 2  --> 6
	public void test_CATEGORY_ROLL_ON_NUMBER_3() throws Exception
	{
		logger.info("Inside test_CATEGORY_ROLL_ON_NUMBER_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( 2, ScoreFromRollingDice.CATEGORY_ROLL_ON_NUMBER, 2, 2, 6, 5, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(6), score);
	}
	
	@Test
	// test on number 3s for 2, 3, 4, 3, 3  --> 9
	public void test_CATEGORY_ROLL_ON_NUMBER_4() throws Exception
	{
		logger.info("Inside test_CATEGORY_ROLL_ON_NUMBER_4 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( 3, ScoreFromRollingDice.CATEGORY_ROLL_ON_NUMBER, 2, 3, 4, 3, 3);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(9), score);
	}
	
}
