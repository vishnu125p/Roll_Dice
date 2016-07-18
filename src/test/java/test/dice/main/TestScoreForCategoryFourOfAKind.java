package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryFourOfAKind extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryFourOfAKind.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 1, 2, 1, 1, 1  --> 4
	public void test_CATEGORY_ROLL_ON_FOUR_OF_A_KIND_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FOUR_OF_A_KIND_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FOUR_OF_A_KIND, 1, 2, 1, 1, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(4), score);
	}
	
	@Test
	// test for 1, 2, 1, 3, 4  --> 0
	public void test_CATEGORY_ROLL_ON_FOUR_OF_A_KIND_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FOUR_OF_A_KIND_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FOUR_OF_A_KIND, 1, 2, 1, 3, 4);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test for 5, 1, 5, 5, 5  --> 20
	public void test_CATEGORY_ROLL_ON_FOUR_OF_A_KIND_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_FOUR_OF_A_KIND_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_FOUR_OF_A_KIND, 5, 1, 5, 5, 5);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(20), score);
	}

}
