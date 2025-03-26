package X5;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class b {
    public static final int a(a aVar, a aVar2, int i8) {
        J6.r.e(aVar, "<this>");
        J6.r.e(aVar2, "other");
        int min = Math.min(aVar2.k() - aVar2.i(), i8);
        if (aVar.g() - aVar.k() <= min) {
            b(aVar, min);
        }
        ByteBuffer h8 = aVar.h();
        int k8 = aVar.k();
        aVar.g();
        ByteBuffer h9 = aVar2.h();
        int i9 = aVar2.i();
        aVar2.k();
        V5.c.c(h9, h8, i9, min, k8);
        aVar2.c(min);
        aVar.a(min);
        return min;
    }

    private static final void b(a aVar, int i8) {
        if ((aVar.g() - aVar.k()) + (aVar.f() - aVar.g()) < i8) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((aVar.k() + i8) - aVar.g() > 0) {
            aVar.m();
        }
    }
}
