/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import chatbot.Bot;
import chatbot.User;

/**
 *
 * @author Osama
 */
public interface Callback {
    public void setUser(User u);
    public void setBot(Bot b);
}
