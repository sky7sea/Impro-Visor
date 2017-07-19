/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp.trading.tradingResponseModes;

import imp.data.MelodyPart;
import imp.data.RhythmCluster;
import imp.generalCluster.CreateGrammar;
import imp.generalCluster.DataPoint;
import polya.Polylist;

/**
 *
 * @author cssummer17
 */
public class CorrectRhythmTRM extends RhythmHelperTRM{
    
    public CorrectRhythmTRM(String message) {
        super(message);
        System.out.println("creating a correctRhythmTRM......");
    }

    
    @Override
    public MelodyPart generateResponse(){
        
        System.out.println("\n\n\nin generateResponse for correct rhythm");
        return getTradingResponse();
//        responseInfo.correctRhythm();
//        return responseInfo.getResponse();
    }
    
    public String toString(){
        return "Rhythm Helper";
    }
    
    @Override
    protected Polylist getRhythmFromCluster(RhythmCluster closestCluster) {
        return closestCluster.getClosestRhythm();
    }
    
}