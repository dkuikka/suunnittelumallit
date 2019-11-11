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
public class BossFactory implements IAbstractFactory {

    @Override
    public IHousut createHousut() {
        return new BossHousut();
    }

    @Override
    public IPaita createPaita() {
        return new BossPaita();
    }

    @Override
    public IHattu createHattu() {
        return new BossHattu();
    }

    @Override
    public IKengät createKengät() {
        return new BossKengät();
    }
    
}
