/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knuth;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luism
 */
public class NewClass {

    private static final Logger LOG = Logger.getLogger(NewClass.class.getName());

    public int key;//key transformation
    public String dado;
    public String[] aF = new String[]{"A", "B", "C", "D", "E", "F"};
    public String[] gL = new String[]{"G", "H", "I", "J", "K", "L"};
    public String[] mR = new String[]{"M", "N", "O", "P", "Q", "R"};
    public String[] sZ = new String[]{"S", "T", "U", "V", "W","Y", "Z"};

    public String hash(int key, String[] s) {

        LOG.log(Level.INFO, "Log hash");

        this.key = key;

        return s[key];

    }

    public String hash2(String r) {

        LOG.log(Level.INFO, "Log hash2");

        switch(r){
            case "A": return aF[0];
            case "B": return aF[1];
            case "C": return aF[2];
            case "D": return aF[3];
            case "E": return aF[4];
            case "F": return aF[5];
            
            case "G": return gL[0];
            case "H": return gL[1];
            case "I": return gL[2];
            case "J": return gL[3];
            case "K": return gL[4];
            case "L": return gL[5];
            
            case "M": return mR[0];
            case "N": return mR[1];
            case "O": return mR[2];
            case "P": return mR[3];
            case "Q": return mR[4];
            case "R": return mR[5];
            
            case "S": return sZ[0];
            case "T": return sZ[1];
            case "U": return sZ[2];
            case "V": return sZ[3];
            case "W": return sZ[4];
            case "Y": return sZ[5];
            case "Z": return sZ[6];
        }
return "";
    }

}
