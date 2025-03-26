package v0;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44056a;

    /* renamed from: b, reason: collision with root package name */
    private a f44057b;

    /* renamed from: c, reason: collision with root package name */
    private Object f44058c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44059d;

    public interface a {
        void a();
    }

    private void c() {
        while (this.f44059d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f44056a) {
                    return;
                }
                this.f44056a = true;
                this.f44059d = true;
                a aVar = this.f44057b;
                Object obj = this.f44058c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f44059d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f44059d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f44057b == aVar) {
                    return;
                }
                this.f44057b = aVar;
                if (this.f44056a && aVar != null) {
                    aVar.a();
                }
            } finally {
            }
        }
    }
}
