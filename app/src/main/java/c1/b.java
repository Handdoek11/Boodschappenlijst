package C1;

import B1.k;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b implements C1.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f749a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f750b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f751c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f749a = new k(executor);
    }

    @Override // C1.a
    public Executor a() {
        return this.f751c;
    }

    @Override // C1.a
    public void b(Runnable runnable) {
        this.f749a.execute(runnable);
    }

    @Override // C1.a
    public k c() {
        return this.f749a;
    }

    public void d(Runnable runnable) {
        this.f750b.post(runnable);
    }
}
