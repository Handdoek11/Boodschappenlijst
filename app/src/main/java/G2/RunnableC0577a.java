package G2;

/* renamed from: G2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0577a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ B f2613o;

    RunnableC0577a(B b8) {
        this.f2613o = b8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2613o.f2562b = Thread.currentThread();
        this.f2613o.a();
    }
}
