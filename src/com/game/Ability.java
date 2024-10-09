package com.game;

public enum Ability {
	
	ATTACK("Attack is the ability to deal damage."),
	DEFENCE("Defence is the ability to reduce damage."),
	DEXTERITY("Dexterity is important for both attack and defence."),
	SKILL("Skill is important for attack and also for critical hit chance."),
	LUCK("Luck is important for critical hit chance."),
	HEALTH("Health is the amount of damage you can tae before you die.");
	
	
	private final String description;
	
	Ability(String description) {
		this.description = description;
	}

}
