package A3;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class O implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ N f200o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Callable f201s;

    O(N n8, Callable callable) {
        this.f200o = n8;
        this.f201s = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f200o.w(this.f201s.call());
        } catch (Exception e8) {
            this.f200o.v(e8);
        } catch (Throwable th) {
            this.f200o.v(new RuntimeException(th));
        }
    }
}
