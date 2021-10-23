package br.com.patterns.mediator.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.patterns.mediator.swing.components.AddButton;
import br.com.patterns.mediator.swing.components.Label;
import br.com.patterns.mediator.swing.components.ResetButton;
import br.com.patterns.mediator.swing.components.State;

public class Client {
	public static void main(String[] args) {
		Screens screens = new Screens();
		screens.init();
	}
}
