package il.co.codeguru.corewars8086.war;

import java.util.EventListener;

/**
 * @author BS
 */
public interface ScoreEventListener  {
    void scoreChanged(String name, float addedValue, int groupIndex, int subIndex);
}
