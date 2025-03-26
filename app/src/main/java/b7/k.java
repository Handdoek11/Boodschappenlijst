package b7;

import U6.Q;

/* loaded from: classes2.dex */
public final class k extends h {

    /* renamed from: t, reason: collision with root package name */
    public final Runnable f12053t;

    public k(Runnable runnable, long j8, i iVar) {
        super(j8, iVar);
        this.f12053t = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f12053t.run();
        } finally {
            this.f12051s.a();
        }
    }

    public String toString() {
        return "Task[" + Q.a(this.f12053t) + '@' + Q.b(this.f12053t) + ", " + this.f12050o + ", " + this.f12051s + ']';
    }
}
