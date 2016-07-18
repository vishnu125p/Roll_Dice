package test.dice.util;

import java.util.Map;
import org.apache.log4j.Logger;

import test.dice.domain.Dice;

/**
 * Utility class to get score for a selected category 
 *
 */
public class ScoreUtil 
{
	
	private static Logger log = Logger.getLogger(ScoreUtil.class.getName());
	
	
	// RollOnNumber category
	public static Integer getScoreFor_RollOnNumber(Dice dice, Integer rollOnNumber) throws Exception
	{
		log.debug("Inside method getScoreFor_RollOnNumber");
		
		Integer score = 0;
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		score = rollOnNumber * ( map.get(rollOnNumber) == null ? 0 : map.get(rollOnNumber) );
		
		return score;
	}

	// On Pair category
	public static Integer getScoreFor_RollOnPair(Dice dice) 
	{
		log.debug("Inside method getScoreFor_RollOnPair");
		
		Integer score = 0;
		Integer tempScore = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find a number in pair
			if ( map.get(diceNumber) >= 2 ) 
			{
				tempScore =  diceNumber * 2;
				
				// if more than one number is pair then consider the highest number score
				score = ( tempScore > score ) ? tempScore : score;
			}
		}
		
		return score;
	}

	// On Two pairs category
	public static Integer getScoreFor_RollOnTwoPairs(Dice dice) 
	{
		log.debug("Inside method getScoreFor_RollOnTwoPairs");
		
		Integer score = 0;
		Integer tempScore = 0;
		Integer pairCount = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find a number in pair
			if ( map.get(diceNumber) >= 2 ) 
			{
				pairCount = pairCount + 1;
				
				tempScore =  tempScore + diceNumber * 2;
				
				// if pair count is 2 then score
				score = ( pairCount == 2 ) ? tempScore : score;
			}
		}
		
		return score;
	}

	// Three of a kind catgeory
	public static Integer getScoreFor_RollOnThreeOfAKind(Dice dice) 
	{
		log.debug("Inside method getScoreFor_RollOnThreeOfAKind");
		
		Integer score = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find three of a kind
			if ( map.get(diceNumber) >= 3 ) 
			{
				score = diceNumber * 3;
			}
		}
		
		return score;
	}

	// Four of a kind catgeory
	public static Integer getScoreFor_RollOnFourOfAKind(Dice dice) 
	{
		log.debug("Inside method getScoreFor_RollOnFourOfAKind");
		
		Integer score = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find Four of a kind
			if ( map.get(diceNumber) >= 4 ) 
			{
				score = diceNumber * 4;
			}
		}
		
		return score;
	}

	// small straight
	public static Integer getScoreFor_SmallStraight(Dice dice) 
	{
		log.debug("Inside method getScoreFor_SmallStraight");
		
		Integer score = 0;
		String pipedNumbers = dice.getPipedDiceNumbers();
		
		//log.info("PipedString: " + pipedNumbers);
		
		if( pipedNumbers.contains("1") &&  pipedNumbers.contains("2") && pipedNumbers.contains("3") &&
				pipedNumbers.contains("4") && pipedNumbers.contains("5") )
			score = 15;
		
		return score;
	}

	// large straight
	public static Integer getScoreFor_LargeStraight(Dice dice) 
	{
		log.debug("Inside method getScoreFor_LargeStraight");
		
		Integer score = 0;
		
		String pipedNumbers = dice.getPipedDiceNumbers();
		
		if( pipedNumbers.contains("2") &&  pipedNumbers.contains("3") && pipedNumbers.contains("4") &&
				pipedNumbers.contains("5") && pipedNumbers.contains("6") )
			score = 20;
		
		return score;
	}

	// full house
	public static Integer getScoreFor_FullHouse(Dice dice) 
	{
		log.debug("Inside method getScoreFor_FullHouse");
		
		Integer score = 0;
		Integer tempScore = 0;
		Integer pairCount = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find 2 of a pair, 3 of a pair
			if ( map.get(diceNumber) == 2 || map.get(diceNumber) == 3 ) 
			{
				pairCount = pairCount + 1;
				
				tempScore =  tempScore + diceNumber * map.get(diceNumber);
				
				// if we find both 2 of a pair, 3 of a pair then score
				score = ( pairCount == 2 ) ? tempScore : score;
			}
		}
		
		return score;
	}

	// Yahtzee 
	public static Integer getScoreFor_Yahtzee(Dice dice) 
	{
		log.debug("Inside method getScoreFor_Yahtzee");
		
		Integer score = 0;
		
		Map<Integer, Integer> map = dice.getDiceNumberCountMap();
		
		for ( Integer diceNumber : map.keySet() )
		{
			// if we can find all dice with same number
			if ( map.get(diceNumber) == 5 ) 
			{
				score = 50;
			}
		}
		
		return score;
	}

	// Chance
	public static Integer getScoreFor_Chance(Dice dice) 
	{
		log.debug("Inside method getScoreFor_Chance");
		
		Integer score = 0;
		
		score = dice.getSumOfDiceNumbers();
		
		return score;
	}
}
