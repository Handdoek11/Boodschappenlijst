package X2;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ y3.l f5938o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ B f5939s;

    z(B b8, y3.l lVar) {
        this.f5939s = b8;
        this.f5938o = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.r3(this.f5939s, this.f5938o);
    }
}
