package n4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0369c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class e implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f39581o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f39582s = new Object();

    /* renamed from: t, reason: collision with root package name */
    private AbstractC0376j f39583t = AbstractC0379m.e(null);

    e(ExecutorService executorService) {
        this.f39581o = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC0376j d(Runnable runnable, AbstractC0376j abstractC0376j) {
        runnable.run();
        return AbstractC0379m.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC0376j e(Callable callable, AbstractC0376j abstractC0376j) {
        return (AbstractC0376j) callable.call();
    }

    public ExecutorService c() {
        return this.f39581o;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f39581o.execute(runnable);
    }

    public AbstractC0376j f(final Runnable runnable) {
        AbstractC0376j m8;
        synchronized (this.f39582s) {
            m8 = this.f39583t.m(this.f39581o, new InterfaceC0369c() { // from class: n4.d
                @Override // A3.InterfaceC0369c
                public final Object a(AbstractC0376j abstractC0376j) {
                    return e.d(runnable, abstractC0376j);
                }
            });
            this.f39583t = m8;
        }
        return m8;
    }

    public AbstractC0376j g(final Callable callable) {
        AbstractC0376j m8;
        synchronized (this.f39582s) {
            m8 = this.f39583t.m(this.f39581o, new InterfaceC0369c() { // from class: n4.c
                @Override // A3.InterfaceC0369c
                public final Object a(AbstractC0376j abstractC0376j) {
                    return e.e(callable, abstractC0376j);
                }
            });
            this.f39583t = m8;
        }
        return m8;
    }
}
