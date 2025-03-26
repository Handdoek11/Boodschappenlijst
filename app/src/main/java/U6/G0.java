package U6;

import Z6.AbstractC0799m;

/* loaded from: classes2.dex */
public abstract class G0 extends I {
    public abstract G0 A0();

    protected final String B0() {
        G0 g02;
        G0 c8 = C0706b0.c();
        if (this == c8) {
            return "Dispatchers.Main";
        }
        try {
            g02 = c8.A0();
        } catch (UnsupportedOperationException unused) {
            g02 = null;
        }
        if (this == g02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // U6.I
    public I z0(int i8) {
        AbstractC0799m.a(i8);
        return this;
    }
}
