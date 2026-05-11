package Jobsheet11;

public class TugasNode {
    
    TugasMahasiswa data;
    TugasNode next;

    public TugasNode(TugasMahasiswa data, TugasNode next) {
        this.data = data;
        this.next = next;
    }
}
