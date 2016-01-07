package com.sample.bean;

public class TxtEditor {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		System.out.println(" Spell Check ");
		spellChecker.checkSpelling();
	}

}
