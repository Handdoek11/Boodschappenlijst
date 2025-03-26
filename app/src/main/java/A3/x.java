package A3;

/* loaded from: classes2.dex */
final class x implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ y f227o;

    x(y yVar) {
        this.f227o = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f227o.f229b) {
            try {
                y yVar = this.f227o;
                if (yVar.f230c != null) {
                    yVar.f230c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
