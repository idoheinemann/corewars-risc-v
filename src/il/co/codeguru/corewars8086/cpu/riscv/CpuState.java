package il.co.codeguru.corewars8086.cpu.riscv;

public class CpuState {
    private int[] registers;
    private int pc;

    public CpuState()
    {
        registers = new int[32];
        pc = 0;
    }

    public int getReg(int index)
    {
        return registers[index];
    }

    public void setReg(int index, int value)
    {
        registers[index] = value;
        // Easier to just put it like this instead of an if
        registers[0] = 0;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }
}