package d2;

import java.util.concurrent.Executor;

/* renamed from: d2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5703e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f35215a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f35216b = new b();

    /* renamed from: d2.e$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC5710l.v(runnable);
        }
    }

    /* renamed from: d2.e$b */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f35216b;
    }

    public static Executor b() {
        return f35215a;
    }
}
