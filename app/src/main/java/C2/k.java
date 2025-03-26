package C2;

import D2.A;
import D2.C0555y;
import G2.D0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.A9;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC1826Uc0;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C3508nd0;
import com.google.android.gms.internal.ads.C3941rc0;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.J7;
import com.google.android.gms.internal.ads.J9;
import com.google.android.gms.internal.ads.L7;
import com.google.android.gms.internal.ads.L9;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k implements Runnable, H9 {

    /* renamed from: A, reason: collision with root package name */
    private final Context f772A;

    /* renamed from: B, reason: collision with root package name */
    private H2.a f773B;

    /* renamed from: C, reason: collision with root package name */
    private final H2.a f774C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f775D;

    /* renamed from: F, reason: collision with root package name */
    private int f777F;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f781u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f782v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f783w;

    /* renamed from: x, reason: collision with root package name */
    private final Executor f784x;

    /* renamed from: y, reason: collision with root package name */
    private final C3941rc0 f785y;

    /* renamed from: z, reason: collision with root package name */
    private Context f786z;

    /* renamed from: o, reason: collision with root package name */
    private final List f778o = new Vector();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f779s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f780t = new AtomicReference();

    /* renamed from: E, reason: collision with root package name */
    final CountDownLatch f776E = new CountDownLatch(1);

    public k(Context context, H2.a aVar) {
        this.f786z = context;
        this.f772A = context;
        this.f773B = aVar;
        this.f774C = aVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f784x = newCachedThreadPool;
        boolean booleanValue = ((Boolean) A.c().a(AbstractC3184kf.f24052y2)).booleanValue();
        this.f775D = booleanValue;
        this.f785y = C3941rc0.a(context, newCachedThreadPool, booleanValue);
        this.f782v = ((Boolean) A.c().a(AbstractC3184kf.f24028v2)).booleanValue();
        this.f783w = ((Boolean) A.c().a(AbstractC3184kf.f24060z2)).booleanValue();
        if (((Boolean) A.c().a(AbstractC3184kf.f24044x2)).booleanValue()) {
            this.f777F = 2;
        } else {
            this.f777F = 1;
        }
        if (!((Boolean) A.c().a(AbstractC3184kf.f23634A3)).booleanValue()) {
            this.f781u = m();
        }
        if (((Boolean) A.c().a(AbstractC3184kf.f24021u3)).booleanValue()) {
            AbstractC1497Kq.f16644a.execute(this);
            return;
        }
        C0555y.b();
        if (H2.g.y()) {
            AbstractC1497Kq.f16644a.execute(this);
        } else {
            run();
        }
    }

    private final H9 q() {
        return o() == 2 ? (H9) this.f780t.get() : (H9) this.f779s.get();
    }

    private final void r() {
        List list = this.f778o;
        H9 q8 = q();
        if (list.isEmpty() || q8 == null) {
            return;
        }
        for (Object[] objArr : this.f778o) {
            int length = objArr.length;
            if (length == 1) {
                q8.h((MotionEvent) objArr[0]);
            } else if (length == 3) {
                q8.g(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f778o.clear();
    }

    private final void s(boolean z7) {
        String str = this.f773B.f2914o;
        Context t7 = t(this.f786z);
        J7 b02 = L7.b0();
        b02.C(z7);
        b02.D(str);
        this.f779s.set(L9.y(t7, new J9((L7) b02.x())));
    }

    private static final Context t(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final E9 u(Context context, H2.a aVar, boolean z7, boolean z8) {
        J7 b02 = L7.b0();
        b02.C(z7);
        b02.D(aVar.f2914o);
        return E9.j(t(context), (L7) b02.x(), z8);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String a(Context context) {
        return k(context, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void b(View view) {
        H9 q8 = q();
        if (q8 != null) {
            q8.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        H9 q8;
        H9 q9;
        if (((Boolean) A.c().a(AbstractC3184kf.f23793U2)).booleanValue()) {
            if (this.f776E.getCount() != 0 || (q9 = q()) == null) {
                return;
            }
            q9.c(stackTraceElementArr);
            return;
        }
        if (!n() || (q8 = q()) == null) {
            return;
        }
        q8.c(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String d(final Context context) {
        try {
            return (String) AbstractC2326ck0.j(new Callable() { // from class: C2.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f767o.k(context, null);
                }
            }, this.f784x).get(((Integer) A.c().a(AbstractC3184kf.f23753P2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return A9.a(context, this.f774C.f2914o, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String e(Context context, String str, View view) {
        return f(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String f(Context context, String str, View view, Activity activity) {
        if (!n()) {
            return "";
        }
        H9 q8 = q();
        if (((Boolean) A.c().a(AbstractC3184kf.Aa)).booleanValue()) {
            v.t();
            D0.k(view, 4, null);
        }
        if (q8 == null) {
            return "";
        }
        r();
        return q8.f(t(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void g(int i8, int i9, int i10) {
        H9 q8 = q();
        if (q8 == null) {
            this.f778o.add(new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)});
        } else {
            r();
            q8.g(i8, i9, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void h(MotionEvent motionEvent) {
        H9 q8 = q();
        if (q8 == null) {
            this.f778o.add(new Object[]{motionEvent});
        } else {
            r();
            q8.h(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String i(Context context, View view, Activity activity) {
        if (!((Boolean) A.c().a(AbstractC3184kf.za)).booleanValue()) {
            H9 q8 = q();
            if (((Boolean) A.c().a(AbstractC3184kf.Aa)).booleanValue()) {
                v.t();
                D0.k(view, 2, null);
            }
            return q8 != null ? q8.i(context, view, activity) : "";
        }
        if (!n()) {
            return "";
        }
        H9 q9 = q();
        if (((Boolean) A.c().a(AbstractC3184kf.Aa)).booleanValue()) {
            v.t();
            D0.k(view, 2, null);
        }
        return q9 != null ? q9.i(context, view, activity) : "";
    }

    public final String k(Context context, byte[] bArr) {
        H9 q8;
        if (!n() || (q8 = q()) == null) {
            return "";
        }
        r();
        return q8.a(t(context));
    }

    final /* synthetic */ void l(boolean z7) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            u(this.f772A, this.f774C, z7, this.f775D).p();
        } catch (NullPointerException e8) {
            this.f785y.c(2027, System.currentTimeMillis() - currentTimeMillis, e8);
        }
    }

    protected final boolean m() {
        Context context = this.f786z;
        j jVar = new j(this);
        C3941rc0 c3941rc0 = this.f785y;
        return new C3508nd0(this.f786z, AbstractC1826Uc0.b(context, c3941rc0), jVar, ((Boolean) A.c().a(AbstractC3184kf.f24036w2)).booleanValue()).d(1);
    }

    public final boolean n() {
        try {
            this.f776E.await();
            return true;
        } catch (InterruptedException e8) {
            H2.p.h("Interrupted during GADSignals creation.", e8);
            return false;
        }
    }

    protected final int o() {
        if (!this.f782v || this.f781u) {
            return this.f777F;
        }
        return 1;
    }

    public final int p() {
        return this.f777F;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) A.c().a(AbstractC3184kf.f23634A3)).booleanValue()) {
                this.f781u = m();
            }
            boolean z7 = this.f773B.f2917u;
            final boolean z8 = false;
            if (!((Boolean) A.c().a(AbstractC3184kf.f23885f1)).booleanValue() && z7) {
                z8 = true;
            }
            if (o() == 1) {
                s(z8);
                if (this.f777F == 2) {
                    this.f784x.execute(new Runnable() { // from class: C2.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f769o.l(z8);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    E9 u7 = u(this.f786z, this.f773B, z8, this.f775D);
                    this.f780t.set(u7);
                    if (this.f783w && !u7.r()) {
                        this.f777F = 1;
                        s(z8);
                    }
                } catch (NullPointerException e8) {
                    this.f777F = 1;
                    s(z8);
                    this.f785y.c(2031, System.currentTimeMillis() - currentTimeMillis, e8);
                }
            }
            this.f776E.countDown();
            this.f786z = null;
            this.f773B = null;
        } catch (Throwable th) {
            this.f776E.countDown();
            this.f786z = null;
            this.f773B = null;
            throw th;
        }
    }
}
