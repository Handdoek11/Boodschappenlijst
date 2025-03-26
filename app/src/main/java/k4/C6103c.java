package k4;

import android.os.Bundle;
import j4.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6103c implements InterfaceC6102b, InterfaceC6101a {

    /* renamed from: a, reason: collision with root package name */
    private final C6105e f38522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38523b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f38524c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f38526e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f38525d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f38527f = false;

    public C6103c(C6105e c6105e, int i8, TimeUnit timeUnit) {
        this.f38522a = c6105e;
        this.f38523b = i8;
        this.f38524c = timeUnit;
    }

    @Override // k4.InterfaceC6101a
    public void a(String str, Bundle bundle) {
        synchronized (this.f38525d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f38526e = new CountDownLatch(1);
                this.f38527f = false;
                this.f38522a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f38526e.await(this.f38523b, this.f38524c)) {
                        this.f38527f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f38526e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.InterfaceC6102b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f38526e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
