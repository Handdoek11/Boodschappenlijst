package Z6;

import U6.R0;

/* loaded from: classes2.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    public final A6.g f6463a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f6464b;

    /* renamed from: c, reason: collision with root package name */
    private final R0[] f6465c;

    /* renamed from: d, reason: collision with root package name */
    private int f6466d;

    public M(A6.g gVar, int i8) {
        this.f6463a = gVar;
        this.f6464b = new Object[i8];
        this.f6465c = new R0[i8];
    }

    public final void a(R0 r02, Object obj) {
        Object[] objArr = this.f6464b;
        int i8 = this.f6466d;
        objArr[i8] = obj;
        R0[] r0Arr = this.f6465c;
        this.f6466d = i8 + 1;
        J6.r.c(r02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        r0Arr[i8] = r02;
    }

    public final void b(A6.g gVar) {
        int length = this.f6465c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            R0 r02 = this.f6465c[length];
            J6.r.b(r02);
            r02.h0(gVar, this.f6464b[length]);
            if (i8 < 0) {
                return;
            } else {
                length = i8;
            }
        }
    }
}
