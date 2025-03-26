package H;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ int a(double d8) {
        long doubleToLongBits = Double.doubleToLongBits(d8);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
