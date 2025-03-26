package w2;

import D2.O1;
import D2.Y0;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f44319a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Y0 f44320b;

    /* renamed from: c, reason: collision with root package name */
    private a f44321c;

    public void a(a aVar) {
        O1 o12;
        synchronized (this.f44319a) {
            this.f44321c = aVar;
            Y0 y02 = this.f44320b;
            if (y02 == null) {
                return;
            }
            if (aVar == null) {
                o12 = null;
            } else {
                try {
                    o12 = new O1(aVar);
                } catch (RemoteException e8) {
                    H2.p.e("Unable to call setVideoLifecycleCallbacks on video controller.", e8);
                }
            }
            y02.N6(o12);
        }
    }

    public final Y0 b() {
        Y0 y02;
        synchronized (this.f44319a) {
            y02 = this.f44320b;
        }
        return y02;
    }

    public final void c(Y0 y02) {
        synchronized (this.f44319a) {
            try {
                this.f44320b = y02;
                a aVar = this.f44321c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static abstract class a {
        public abstract void a();

        public abstract void c();

        public abstract void e();

        public void d() {
        }

        public void b(boolean z7) {
        }
    }
}
