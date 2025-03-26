package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class I9 implements H9 {

    /* renamed from: L, reason: collision with root package name */
    protected static volatile C3610oa f15880L;

    /* renamed from: A, reason: collision with root package name */
    protected double f15881A;

    /* renamed from: B, reason: collision with root package name */
    private double f15882B;

    /* renamed from: C, reason: collision with root package name */
    private double f15883C;

    /* renamed from: D, reason: collision with root package name */
    protected float f15884D;

    /* renamed from: E, reason: collision with root package name */
    protected float f15885E;

    /* renamed from: F, reason: collision with root package name */
    protected float f15886F;

    /* renamed from: G, reason: collision with root package name */
    protected float f15887G;

    /* renamed from: J, reason: collision with root package name */
    protected DisplayMetrics f15890J;

    /* renamed from: K, reason: collision with root package name */
    protected C2631fa f15891K;

    /* renamed from: o, reason: collision with root package name */
    protected MotionEvent f15892o;

    /* renamed from: s, reason: collision with root package name */
    protected final LinkedList f15893s = new LinkedList();

    /* renamed from: t, reason: collision with root package name */
    protected long f15894t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected long f15895u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected long f15896v = 0;

    /* renamed from: w, reason: collision with root package name */
    protected long f15897w = 0;

    /* renamed from: x, reason: collision with root package name */
    protected long f15898x = 0;

    /* renamed from: y, reason: collision with root package name */
    protected long f15899y = 0;

    /* renamed from: z, reason: collision with root package name */
    protected long f15900z = 0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f15888H = false;

    /* renamed from: I, reason: collision with root package name */
    protected boolean f15889I = false;

    protected I9(Context context) {
        try {
            AbstractC3027j9.e();
            this.f15890J = context.getResources().getDisplayMetrics();
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
                this.f15891K = new C2631fa();
            }
        } catch (Throwable unused) {
        }
    }

    private final void o() {
        this.f15898x = 0L;
        this.f15894t = 0L;
        this.f15895u = 0L;
        this.f15896v = 0L;
        this.f15897w = 0L;
        this.f15899y = 0L;
        this.f15900z = 0L;
        if (this.f15893s.isEmpty()) {
            MotionEvent motionEvent = this.f15892o;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f15893s.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f15893s.clear();
        }
        this.f15892o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[PHI: r1 r8
  0x007c: PHI (r1v10 int) = (r1v2 int), (r1v2 int), (r1v11 int), (r1v12 int) binds: [B:34:0x007e, B:35:0x0080, B:32:0x007b, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r8v6 com.google.android.gms.internal.ads.i8) = 
  (r8v3 com.google.android.gms.internal.ads.i8)
  (r8v3 com.google.android.gms.internal.ads.i8)
  (r8v8 com.google.android.gms.internal.ads.i8)
  (r8v8 com.google.android.gms.internal.ads.i8)
 binds: [B:34:0x007e, B:35:0x0080, B:32:0x007b, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String p(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I9.p(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String a(Context context) {
        if (AbstractC3936ra.c()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return p(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C2631fa c2631fa;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue() || (c2631fa = this.f15891K) == null) {
            return;
        }
        c2631fa.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String e(Context context, String str, View view) {
        return p(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String f(Context context, String str, View view, Activity activity) {
        return p(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final synchronized void g(int i8, int i9, int i10) {
        try {
            if (this.f15892o != null) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23665E2)).booleanValue()) {
                    o();
                } else {
                    this.f15892o.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f15890J;
            if (displayMetrics != null) {
                float f8 = displayMetrics.density;
                this.f15892o = MotionEvent.obtain(0L, i10, 1, i8 * f8, i9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f15892o = null;
            }
            this.f15889I = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final synchronized void h(MotionEvent motionEvent) {
        Long l8;
        try {
            if (this.f15888H) {
                o();
                this.f15888H = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f15881A = 0.0d;
                this.f15882B = motionEvent.getRawX();
                this.f15883C = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d8 = rawX - this.f15882B;
                double d9 = rawY - this.f15883C;
                this.f15881A += Math.sqrt((d8 * d8) + (d9 * d9));
                this.f15882B = rawX;
                this.f15883C = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f15892o = obtain;
                        this.f15893s.add(obtain);
                        if (this.f15893s.size() > 6) {
                            ((MotionEvent) this.f15893s.remove()).recycle();
                        }
                        this.f15896v++;
                        this.f15898x = j(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f15895u += motionEvent.getHistorySize() + 1;
                        C3828qa n8 = n(motionEvent);
                        Long l9 = n8.f25943e;
                        if (l9 != null && n8.f25946h != null) {
                            this.f15899y += l9.longValue() + n8.f25946h.longValue();
                        }
                        if (this.f15890J != null && (l8 = n8.f25944f) != null && n8.f25947i != null) {
                            this.f15900z += l8.longValue() + n8.f25947i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f15897w++;
                    }
                } catch (zzavt unused) {
                }
            } else {
                this.f15884D = motionEvent.getX();
                this.f15885E = motionEvent.getY();
                this.f15886F = motionEvent.getRawX();
                this.f15887G = motionEvent.getRawY();
                this.f15894t++;
            }
            this.f15889I = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.H9
    public final String i(Context context, View view, Activity activity) {
        return p(context, null, 2, view, activity, null);
    }

    protected abstract long j(StackTraceElement[] stackTraceElementArr);

    protected abstract C2918i8 k(Context context, View view, Activity activity);

    protected abstract C2918i8 l(Context context, U7 u7);

    protected abstract C2918i8 m(Context context, View view, Activity activity);

    protected abstract C3828qa n(MotionEvent motionEvent);
}
