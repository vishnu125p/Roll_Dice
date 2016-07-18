package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryChance extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryChance.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 2, 2, 2, 2, 2  --> 10
	public void test_CATEGORY_ROLL_ON_CHANCE_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_CHANCE_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_CHANCE, 2, 2, 2, 2, 2);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(10), score);
	}

	@Test
	// test for 1, 2, 3, 4, 5  --> 15
	public void test_CATEGORY_ROLL_ON_CHANCE_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_CHANCE_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_CHANCE, 1, 2, 3, 4, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(15), score);
	}
	
	@Test
	// test for 5, 2, 1, 6, 3  --> 17
	public void test_CATEGORY_ROLL_ON_CHANCE_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_CHANCE_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_CHANCE, 5, 2, 1, 6, 3);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(17), score);
	}
	
	@Test
	// test for 2, 3, 4, 1, 5  --> 15
	public void test_CATEGORY_ROLL_ON_CHANCE_4() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_CHANCE_4 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_CHANCE, 2, 3, 4, 1, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(15), score);
	}
}
