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
public class Jasper {
    
    public Jasper (IAbstractFactory factory) {
        housut = factory.createHousut();
        paita = factory.createPaita();
        kengät = factory.createKengät();
        hattu = factory.createHattu();
    }
    
    private IHousut housut;
    private IPaita paita;
    private IKengät kengät;
    private IHattu hattu;
    
    public void esitteleVaatteet() {
        System.out.println("Kyllä kelpaa kun " + housut);
        System.out.println("Oonpa cooli kun " + paita);
        System.out.println("Hyvältä näyttää kun " + hattu);
        System.out.println("Tsekkaa mun swägi kun " + kengät);
    }
}
