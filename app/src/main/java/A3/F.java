package A3;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class F implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0376j f183o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ G f184s;

    F(G g8, AbstractC0376j abstractC0376j) {
        this.f184s = g8;
        this.f183o = abstractC0376j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0376j a8 = this.f184s.f186b.a(this.f183o.o());
            if (a8 == null) {
                this.f184s.e(new NullPointerException("Continuation returned null"));
                return;
            }
            G g8 = this.f184s;
            Executor executor = AbstractC0378l.f205b;
            a8.j(executor, g8);
            a8.g(executor, this.f184s);
            a8.b(executor, this.f184s);
        } catch (RuntimeExecutionException e8) {
            if (e8.getCause() instanceof Exception) {
                this.f184s.e((Exception) e8.getCause());
            } else {
                this.f184s.e(e8);
            }
        } catch (CancellationException unused) {
            this.f184s.c();
        } catch (Exception e9) {
            this.f184s.e(e9);
        }
    }
}
