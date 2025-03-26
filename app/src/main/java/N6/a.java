package N6;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // N6.c
    public int b(int i8) {
        return d.d(h().nextInt(), i8);
    }

    @Override // N6.c
    public int c() {
        return h().nextInt();
    }

    @Override // N6.c
    public int d(int i8) {
        return h().nextInt(i8);
    }

    @Override // N6.c
    public long e() {
        return h().nextLong();
    }

    public abstract Random h();
}
