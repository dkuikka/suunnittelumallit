/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        ITarget suomenkielinenOlio = new Adapter(new Adaptee());
        suomenkielinenOlio.tervehdi();
        // suomenkielinen olio tulostaa adapter patternin avulla tervehdyksen espanjaksi
    }
}
