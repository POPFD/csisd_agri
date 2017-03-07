/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author SaneetBhella
 */
public interface Subject {
    //observer design pattern interface
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
