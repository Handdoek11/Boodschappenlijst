package A3;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final Object f188a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f189b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f190c;

    I() {
    }

    public final void a(H h8) {
        synchronized (this.f188a) {
            try {
                if (this.f189b == null) {
                    this.f189b = new ArrayDeque();
                }
                this.f189b.add(h8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC0376j abstractC0376j) {
        H h8;
        synchronized (this.f188a) {
            if (this.f189b != null && !this.f190c) {
                this.f190c = true;
                while (true) {
                    synchronized (this.f188a) {
                        try {
                            h8 = (H) this.f189b.poll();
                            if (h8 == null) {
                                this.f190c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    h8.d(abstractC0376j);
                }
            }
        }
    }
}
