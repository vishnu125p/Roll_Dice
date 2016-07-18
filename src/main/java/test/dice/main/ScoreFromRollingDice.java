package test.dice.main;

import org.apache.log4j.Logger;

import test.dice.domain.Dice;
import test.dice.util.ScoreUtil;

/**
 * class to calculate score from rolling a dice upon selection of category 
 *
 */
public class ScoreFromRollingDice {

	private static Logger log = Logger.getLogger(ScoreFromRollingDice.class.getName());
	
	// constants
	public static final String CATEGORY_ROLL_ON_NUMBER = "Roll_On_Number";
	public static final String CATEGORY_ROLL_ON_PAIR = "Roll_On_Pair";
	public static final String CATEGORY_ROLL_ON_TWO_PAIRS = "Roll_On_Two_Pairs";
	public static final String CATEGORY_ROLL_ON_THREE_OF_A_KIND = "Roll_On_Three_Of_a_Kind";
	public static final String CATEGORY_ROLL_ON_FOUR_OF_A_KIND = "Roll_On_Four_Of_a_Kind";
	public static final String CATEGORY_ROLL_ON_SMALL_STRAIGHT = "Roll_On_Small_Straight";
	public static final String CATEGORY_ROLL_ON_LARGE_STRAIGHT = "Roll_On_Large_Straight";
	public static final String CATEGORY_ROLL_ON_FULL_HOUSE = "Roll_On_Full_House";
	public static final String CATEGORY_ROLL_ON_YAHTZEE = "Roll_On_Yahtzee";
	public static final String CATEGORY_ROLL_ON_CHANCE = "Roll_On_Chance";
	
	
	// method to switch to a selected category to obtain the score
	public Integer getScoreForCategory(Integer rollOnNumber, String Category, Integer dice1, Integer dice2, Integer dice3, Integer dice4, Integer dice5) throws Exception
	{
		log.debug("Inside ScoreFromRollingDice method");
		
		Integer score = 0;
		
		Dice dice = setDiceObject( dice1, dice2, dice3, dice4, dice5 );
		
		if ( Category != null )
		{
			switch ( Category )
			{
				case CATEGORY_ROLL_ON_NUMBER:
					if ( rollOnNumber == null || rollOnNumber <= 0 || rollOnNumber > 5 )
					{
						log.error( "RollOnNumber is null, Please select a RollOnNumber" );
						throw new Exception( "RollOnNumber is null, Please select a RollOnNumber" );
					}
					else
						score = ScoreUtil.getScoreFor_RollOnNumber( dice, rollOnNumber );
					break;
				case CATEGORY_ROLL_ON_PAIR:
					score = ScoreUtil.getScoreFor_RollOnPair( dice );
					break;
				case CATEGORY_ROLL_ON_TWO_PAIRS:
					score = ScoreUtil.getScoreFor_RollOnTwoPairs( dice );
					break;
				case CATEGORY_ROLL_ON_THREE_OF_A_KIND:
					score = ScoreUtil.getScoreFor_RollOnThreeOfAKind( dice );
					break;
				case CATEGORY_ROLL_ON_FOUR_OF_A_KIND:
					score = ScoreUtil.getScoreFor_RollOnFourOfAKind( dice );
					break;
				case CATEGORY_ROLL_ON_SMALL_STRAIGHT:
					score = ScoreUtil.getScoreFor_SmallStraight( dice );
					break;
				case CATEGORY_ROLL_ON_LARGE_STRAIGHT:
					score = ScoreUtil.getScoreFor_LargeStraight( dice );
					break;
				case CATEGORY_ROLL_ON_FULL_HOUSE:
					score = ScoreUtil.getScoreFor_FullHouse( dice );
					break;
				case CATEGORY_ROLL_ON_YAHTZEE:
					score = ScoreUtil.getScoreFor_Yahtzee( dice );
					break;
				case CATEGORY_ROLL_ON_CHANCE:
					score = ScoreUtil.getScoreFor_Chance( dice );
					break;
					
				default:
					log.error( "This is not a listed Category, Please select a valid Category" );
					break;
			}
		}
		else
		{
			log.error( "There is no Category Selected, Please select a category" );
			throw new Exception( "There is no Category Selected, Please select a category" );
		}
		
		return score;
	}

	// set dice object
	private Dice setDiceObject(Integer dice1, Integer dice2, Integer dice3, Integer dice4, Integer dice5) 
	{
		Dice dice = new Dice();
		
		dice.setDice1(dice1);
		dice.setDice2(dice2);
		dice.setDice3(dice3);
		dice.setDice4(dice4);
		dice.setDice5(dice5);
		
		return dice;
	}
}
