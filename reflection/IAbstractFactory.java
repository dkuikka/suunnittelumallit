/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import abstractfactory.*;

/**
 *
 * @author user
 */
public interface IAbstractFactory {
    public abstract IHousut createHousut();
    public abstract IPaita createPaita();
    public abstract IHattu createHattu();
    public abstract IKengät createKengät();
}
