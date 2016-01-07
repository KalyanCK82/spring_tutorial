package com.sample.bean;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println(" In TextEditor Constructor");
		this.spellChecker = spellChecker;

	}

	public void spellCheck() {
		System.out.println(" Spell Check ");
		spellChecker.checkSpelling();
	}

}
