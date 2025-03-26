package l3;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ l f38789o;

    /* synthetic */ j(l lVar, i iVar) {
        this.f38789o = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long b8 = this.f38789o.b();
        if (b8 == -1 || f3.h.d().a() <= b8) {
            return;
        }
        l.f(this.f38789o.f38791a);
    }
}
