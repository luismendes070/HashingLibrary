package knuth;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luism
 */
public class HashingStrings {

    private static final Logger LOG = Logger.getLogger(HashingStrings.class.getName());
    
    //public Object[] data;
    public int[] keyTable;
    public int[] dataTable;// 1 <= j <= NTotalNumberOfRecords
    public int NTotalNumberOfRecords;
    
    private static final int EMPTY = -1;
    private static final int LAST = 0;
    
    public HashingStrings() {
    }

    public boolean isNome(String nome) {
        LOG.log(Level.INFO, "isNome({0})", nome);
        
        return nome.length() > 0;
    }

    public boolean searchJOneAllPositions(int jOne) {
        LOG.log(Level.INFO, "search({0})", jOne);
        return jOne == 1;
    }

    public boolean searchWasUncessfull(int j, int n) {
        LOG.info("The search Was Uncessfull");
        return j > n;
    }

    public boolean getKey(int j, int K) {
        LOG.log(Level.INFO, "getKey j {0},{1}", new Object[]{j, K});
        //data[j] = new Object(new Integer(j));
        dataTable[j] = j;
        return j == K;
    }

    public boolean stop(boolean b) {
        LOG.log(Level.INFO, "stop {0}", b);
        return true;
    }

    
    
    
    
    
}
