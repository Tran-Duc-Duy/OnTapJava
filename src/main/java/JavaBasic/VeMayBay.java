package JavaBasic;

public class VeMayBay {
    // số thứ tự, trạng thái

    private int stt;
    private boolean trangThai;// true thi con, false thi ban

    public VeMayBay() {
    }

    public VeMayBay( int stt, boolean trangThai) {

        this.stt = stt;
        this.trangThai = trangThai;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "VeMayBay{stt=" + stt +
                ", trangThai=" + trangThai +
                '}';
    }
    public void Ban(){
        setTrangThai(false);
    }
    public void TraLai(){
        setTrangThai(true);
    }
}
