package O6;

import J6.r;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a extends N6.a {
    @Override // N6.c
    public long f(long j8) {
        return ThreadLocalRandom.current().nextLong(j8);
    }

    @Override // N6.c
    public long g(long j8, long j9) {
        return ThreadLocalRandom.current().nextLong(j8, j9);
    }

    @Override // N6.a
    public Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        r.d(current, "current(...)");
        return current;
    }
}
