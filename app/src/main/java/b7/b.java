package b7;

import U6.AbstractC0726l0;
import U6.I;
import Z6.F;
import Z6.H;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class b extends AbstractC0726l0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final b f12041u = new b();

    /* renamed from: v, reason: collision with root package name */
    private static final I f12042v = m.f12062t.z0(H.e("kotlinx.coroutines.io.parallelism", P6.m.c(64, F.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // U6.AbstractC0726l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        q0(A6.h.f250o, runnable);
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        f12042v.q0(gVar, runnable);
    }

    @Override // U6.I
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // U6.I
    public void u0(A6.g gVar, Runnable runnable) {
        f12042v.u0(gVar, runnable);
    }

    @Override // U6.I
    public I z0(int i8) {
        return m.f12062t.z0(i8);
    }
}
