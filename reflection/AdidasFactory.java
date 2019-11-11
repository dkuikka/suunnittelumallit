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
public class AdidasFactory implements IAbstractFactory {

    @Override
    public IHousut createHousut() {
        return new AdidasHousut();
    }

    @Override
    public IPaita createPaita() {
        return new AdidasPaita();
    }

    @Override
    public IHattu createHattu() {
        return new AdidasHattu();
    }

    @Override
    public IKengät createKengät() {
        return new AdidasKengät();
    }
    
}
