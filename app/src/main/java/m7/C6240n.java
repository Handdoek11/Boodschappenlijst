package m7;

import x6.C6914C;

/* renamed from: m7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6240n extends C6232f {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6240n(D d8, boolean z7) {
        super(d8);
        J6.r.e(d8, "writer");
        this.f39458c = z7;
    }

    @Override // m7.C6232f
    public void d(byte b8) {
        boolean z7 = this.f39458c;
        String h8 = x6.v.h(x6.v.c(b8));
        if (z7) {
            m(h8);
        } else {
            j(h8);
        }
    }

    @Override // m7.C6232f
    public void h(int i8) {
        boolean z7 = this.f39458c;
        int c8 = x6.x.c(i8);
        if (z7) {
            m(Long.toString(c8 & 4294967295L, 10));
        } else {
            j(Long.toString(c8 & 4294967295L, 10));
        }
    }

    @Override // m7.C6232f
    public void i(long j8) {
        boolean z7 = this.f39458c;
        long c8 = x6.z.c(j8);
        if (z7) {
            m(AbstractC6238l.a(c8, 10));
        } else {
            j(AbstractC6239m.a(c8, 10));
        }
    }

    @Override // m7.C6232f
    public void k(short s8) {
        boolean z7 = this.f39458c;
        String h8 = C6914C.h(C6914C.c(s8));
        if (z7) {
            m(h8);
        } else {
            j(h8);
        }
    }
}
