/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.emergencyservice.worldui.slick;

import com.wordpress.salaboy.events.keyboard.KeyboardPulseEventGenerator;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

/**
 *
 * @author esteban
 */
public class WorldKeyListener implements KeyListener {
    private final WorldUI worldUI;
    
    WorldKeyListener(WorldUI cityMapUI) {
        this.worldUI = cityMapUI;
    }

    @Override
    public void keyPressed(int i, char c) {
        if (Input.KEY_SPACE == i){
            this.worldUI.addRandomEmergency();
        }else if(Input.KEY_ESCAPE == i){
            this.worldUI.goToGlobalMap();
        }else{
            KeyboardPulseEventGenerator.getInstance().generateEvent(c);
        }
    }

    @Override
    public void keyReleased(int i, char c) {
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }

}
