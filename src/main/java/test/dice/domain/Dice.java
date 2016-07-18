package test.dice.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 *  domain class for Dice
 */
public class Dice {

	private static Logger log = Logger.getLogger(Dice.class.getName());
	
	private Integer dice1;
	private Integer dice2;
	private Integer dice3;
	private Integer dice4;
	private Integer dice5;
		
	public Integer getDice1() {
		return dice1;
	}
	public void setDice1(Integer dice1) {
		this.dice1 = dice1;
	}
	public Integer getDice2() {
		return dice2;
	}
	public void setDice2(Integer dice2) {
		this.dice2 = dice2;
	}
	public Integer getDice3() {
		return dice3;
	}
	public void setDice3(Integer dice3) {
		this.dice3 = dice3;
	}
	public Integer getDice4() {
		return dice4;
	}
	public void setDice4(Integer dice4) {
		this.dice4 = dice4;
	}
	public Integer getDice5() {
		return dice5;
	}
	public void setDice5(Integer dice5) {
		this.dice5 = dice5;
	}
	
	public String toString() 
	{
		StringBuilder builder = new StringBuilder("Dice1: ").append(dice1).append(";").
				append("Dice2: ").append(dice2).append(";").
				append("Dice3: ").append(dice3).append(";").
				append("Dice4: ").append(dice4).append(";").
				append("Dice5: ").append(dice5).append(";");
		
		log.info( "Info: : " + builder.toString() );
		
		return builder.toString();
	}
	
	// get sum of all dice
	public Integer getSumOfDiceNumbers()
	{
		return dice1 + dice2 + dice3 + dice4 + dice5;
	}
	
	// gives piped string of dice numbers
	public String getPipedDiceNumbers()
	{
		return new StringBuilder("|").append(dice1).append("|").append(dice2).append("|").append(dice3).append("|").
				append(dice4).append("|").append(dice5).toString();
	}
	
	// gives the count of each numbered dice
	public Map<Integer, Integer> getDiceNumberCountMap() 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		List<Integer> diceList = new ArrayList<Integer>();
		diceList.add(dice1); diceList.add(dice2); diceList.add(dice3); diceList.add(dice4); diceList.add(dice5);
		
		for ( Integer dice : diceList )
		{
			if ( map.get(dice) == null )
				map.put( dice, 1 );
			else
				map.put( dice, map.get(dice) + 1 );
		}
			 
		return map;
	}
}
