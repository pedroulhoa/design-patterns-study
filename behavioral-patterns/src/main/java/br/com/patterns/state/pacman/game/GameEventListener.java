package br.com.patterns.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
