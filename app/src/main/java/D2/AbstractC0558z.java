package D2;

import w2.AbstractC6878d;

/* renamed from: D2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0558z extends AbstractC6878d {

    /* renamed from: o, reason: collision with root package name */
    private final Object f1370o = new Object();

    /* renamed from: s, reason: collision with root package name */
    private AbstractC6878d f1371s;

    @Override // w2.AbstractC6878d
    public final void I0() {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.I0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.AbstractC6878d
    public final void g() {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.AbstractC6878d
    public void i(w2.m mVar) {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.i(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.AbstractC6878d
    public final void m() {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.AbstractC6878d
    public void o() {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.AbstractC6878d
    public final void p() {
        synchronized (this.f1370o) {
            try {
                AbstractC6878d abstractC6878d = this.f1371s;
                if (abstractC6878d != null) {
                    abstractC6878d.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(AbstractC6878d abstractC6878d) {
        synchronized (this.f1370o) {
            this.f1371s = abstractC6878d;
        }
    }
}
