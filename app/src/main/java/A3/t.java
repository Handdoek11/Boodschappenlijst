package A3;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* loaded from: classes2.dex */
final class t implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f217o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u f218s;

    t(u uVar, AbstractC0376j abstractC0376j) {
        this.f218s = uVar;
        this.f217o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f217o.q()) {
            this.f218s.f221c.x();
            return;
        }
        try {
            this.f218s.f221c.w(this.f218s.f220b.a(this.f217o));
        } catch (RuntimeExecutionException e8) {
            if (e8.getCause() instanceof Exception) {
                this.f218s.f221c.v((Exception) e8.getCause());
            } else {
                this.f218s.f221c.v(e8);
            }
        } catch (Exception e9) {
            this.f218s.f221c.v(e9);
        }
    }
}
