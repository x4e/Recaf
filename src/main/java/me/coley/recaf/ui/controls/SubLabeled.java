package me.coley.recaf.ui.controls;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Label with sub-label.
 *
 * @author Matt
 */
public class SubLabeled extends VBox {
	/**
	 * @param primary
	 * 		Main text, more prominent.
	 * @param secondary
	 * 		Secondary text, less prominent.
	 */
	public SubLabeled(String primary, String secondary) {
		this(primary, secondary, "h2");
	}

	/**
	 * @param primary
	 * 		Main text, more prominent.
	 * @param secondary
	 * 		Secondary text, less prominent.
	 * @param primaryClass
	 * 		Header style class.
	 */
	public SubLabeled(String primary, String secondary, String primaryClass) {
		Label lblPrimary = new Label(primary);
		Label lblSecondary = new Label(secondary);
		lblPrimary.getStyleClass().add(primaryClass);
		lblSecondary.getStyleClass().add("faint");
		getChildren().addAll(lblPrimary, lblSecondary);
	}
}
