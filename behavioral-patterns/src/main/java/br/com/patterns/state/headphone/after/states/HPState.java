package br.com.patterns.state.headphone.after.states;

import br.com.patterns.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
