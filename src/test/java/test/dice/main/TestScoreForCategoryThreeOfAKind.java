package test.dice.main;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TestScoreForCategoryThreeOfAKind extends TestCase 
{

	private static Logger logger = Logger.getLogger(TestScoreForCategoryThreeOfAKind.class.getName());

	@Before
	public void setUp() throws Exception 
	{
		logger.info("Setting the properties required.");

	}

	@Test
	// test for 1, 2, 1, 3, 1  --> 3
	public void test_CATEGORY_ROLL_ON_THREE_OF_A_KIND_1() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_THREE_OF_A_KIND_1 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_THREE_OF_A_KIND, 1, 2, 1, 3, 1);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(3), score);
	}
	
	@Test
	// test for 1, 2, 1, 3, 4  --> 0
	public void test_CATEGORY_ROLL_ON_THREE_OF_A_KIND_2() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_THREE_OF_A_KIND_2 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_THREE_OF_A_KIND, 1, 2, 1, 3, 4);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(0), score);
	}
	
	@Test
	// test for 3, 4, 3, 1, 3  --> 9
	public void test_CATEGORY_ROLL_ON_THREE_OF_A_KIND_3() throws Exception
	{
		logger.info("Inside CATEGORY_ROLL_ON_THREE_OF_A_KIND_3 method");
		ScoreFromRollingDice scoreInst = new ScoreFromRollingDice();
		
		Integer score = scoreInst.getScoreForCategory( null, ScoreFromRollingDice.CATEGORY_ROLL_ON_THREE_OF_A_KIND, 3, 4, 3, 1, 3);

		logger.debug("Score: "+score);
		assertEquals(Integer.valueOf(9), score);
	}

}
