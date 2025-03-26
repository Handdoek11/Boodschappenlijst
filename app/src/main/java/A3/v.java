package A3;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class v implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f222o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ w f223s;

    v(w wVar, AbstractC0376j abstractC0376j) {
        this.f223s = wVar;
        this.f222o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0376j abstractC0376j = (AbstractC0376j) this.f223s.f225b.a(this.f222o);
            if (abstractC0376j == null) {
                this.f223s.e(new NullPointerException("Continuation returned null"));
                return;
            }
            w wVar = this.f223s;
            Executor executor = AbstractC0378l.f205b;
            abstractC0376j.j(executor, wVar);
            abstractC0376j.g(executor, this.f223s);
            abstractC0376j.b(executor, this.f223s);
        } catch (RuntimeExecutionException e8) {
            if (e8.getCause() instanceof Exception) {
                this.f223s.f226c.v((Exception) e8.getCause());
            } else {
                this.f223s.f226c.v(e8);
            }
        } catch (Exception e9) {
            this.f223s.f226c.v(e9);
        }
    }
}
