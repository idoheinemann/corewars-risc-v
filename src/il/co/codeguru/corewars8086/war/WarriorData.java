package il.co.codeguru.corewars8086.war;

/**
 * Holds a single warrior's name & code.
 * 
 * @author DL
 */
public class WarriorData {

    /**
     * Constructor.
     * @param name   Warrior's name.
     * @param code   Warrior's code.
     */
    public WarriorData(String name, byte[] code, String label) {
        m_name = name;
        m_code = code;
        m_label = label;
    }

    /** @return the warrior's name. */
    public String getName() {
        return m_name;
    }
    public String getLabel() {
        return m_label;
    }

    /** @return the warrior's code. */
    public byte[] getCode() {
        return m_code;
    }

    /** Holds warrior's name */
    private final String m_name;
    private final String m_label; // label is unique, it looks like A1 for player A, warrior 1

    /** Holds warrior's code */
    private final byte[] m_code;


    @Override
    public String toString() {
        return m_name;
    }
}
