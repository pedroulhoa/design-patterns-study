package br.com.patterns.mediator.swing.components;

import br.com.patterns.mediator.swing.mediator.Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddButton extends JButton {

    public AddButton(Mediator mediator) {
        super("Click me!");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.buttonClicked();
            }
        });
    }
}
