package f7;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class a implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final a f35896o = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
