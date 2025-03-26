package B1;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import s1.C6722b;
import s1.m;
import t1.AbstractC6785f;
import t1.C6782c;
import t1.C6786g;
import t1.C6789j;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final String f333t = s1.j.f("EnqueueRunnable");

    /* renamed from: o, reason: collision with root package name */
    private final C6786g f334o;

    /* renamed from: s, reason: collision with root package name */
    private final C6782c f335s = new C6782c();

    public b(C6786g c6786g) {
        this.f334o = c6786g;
    }

    private static boolean b(C6786g c6786g) {
        boolean c8 = c(c6786g.g(), c6786g.f(), (String[]) C6786g.l(c6786g).toArray(new String[0]), c6786g.d(), c6786g.b());
        c6786g.k();
        return c8;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0135 A[PHI: r0 r8 r11 r12 r13
  0x0135: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v15 java.lang.String[])
  (r0v15 java.lang.String[])
 binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:80:0x0134, B:79:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:80:0x0134, B:79:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:80:0x0134, B:79:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:80:0x0134, B:79:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:80:0x0134, B:79:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(t1.C6789j r16, java.util.List r17, java.lang.String[] r18, java.lang.String r19, s1.d r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.b.c(t1.j, java.util.List, java.lang.String[], java.lang.String, s1.d):boolean");
    }

    private static boolean e(C6786g c6786g) {
        List<C6786g> e8 = c6786g.e();
        boolean z7 = false;
        if (e8 != null) {
            boolean z8 = false;
            for (C6786g c6786g2 : e8) {
                if (c6786g2.j()) {
                    s1.j.c().h(f333t, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c6786g2.c())), new Throwable[0]);
                } else {
                    z8 |= e(c6786g2);
                }
            }
            z7 = z8;
        }
        return b(c6786g) | z7;
    }

    private static void g(A1.p pVar) {
        C6722b c6722b = pVar.f104j;
        String str = pVar.f97c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c6722b.f() || c6722b.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f99e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f97c = ConstraintTrackingWorker.class.getName();
            pVar.f99e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase o8 = this.f334o.g().o();
        o8.c();
        try {
            boolean e8 = e(this.f334o);
            o8.r();
            return e8;
        } finally {
            o8.g();
        }
    }

    public s1.m d() {
        return this.f335s;
    }

    public void f() {
        C6789j g8 = this.f334o.g();
        AbstractC6785f.b(g8.i(), g8.o(), g8.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f334o.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f334o));
            }
            if (a()) {
                g.a(this.f334o.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f335s.a(s1.m.f42693a);
        } catch (Throwable th) {
            this.f335s.a(new m.b.a(th));
        }
    }
}
