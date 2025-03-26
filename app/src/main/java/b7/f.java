package b7;

import U6.AbstractC0726l0;

/* loaded from: classes2.dex */
public abstract class f extends AbstractC0726l0 {

    /* renamed from: u, reason: collision with root package name */
    private final int f12045u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12046v;

    /* renamed from: w, reason: collision with root package name */
    private final long f12047w;

    /* renamed from: x, reason: collision with root package name */
    private final String f12048x;

    /* renamed from: y, reason: collision with root package name */
    private a f12049y = A0();

    public f(int i8, int i9, long j8, String str) {
        this.f12045u = i8;
        this.f12046v = i9;
        this.f12047w = j8;
        this.f12048x = str;
    }

    private final a A0() {
        return new a(this.f12045u, this.f12046v, this.f12047w, this.f12048x);
    }

    public final void B0(Runnable runnable, i iVar, boolean z7) {
        this.f12049y.i(runnable, iVar, z7);
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        a.j(this.f12049y, runnable, null, false, 6, null);
    }

    @Override // U6.I
    public void u0(A6.g gVar, Runnable runnable) {
        a.j(this.f12049y, runnable, null, true, 2, null);
    }
}
