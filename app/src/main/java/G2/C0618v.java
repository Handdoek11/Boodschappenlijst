package G2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C3490nP;
import com.google.android.gms.internal.ads.EnumC3054jP;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: G2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2706a;

    /* renamed from: b, reason: collision with root package name */
    private final C3490nP f2707b;

    /* renamed from: c, reason: collision with root package name */
    private String f2708c;

    /* renamed from: d, reason: collision with root package name */
    private String f2709d;

    /* renamed from: e, reason: collision with root package name */
    private String f2710e;

    /* renamed from: f, reason: collision with root package name */
    private String f2711f;

    /* renamed from: g, reason: collision with root package name */
    private int f2712g;

    /* renamed from: h, reason: collision with root package name */
    private int f2713h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f2714i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f2715j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f2716k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f2717l;

    public C0618v(Context context) {
        this.f2712g = 0;
        this.f2717l = new Runnable() { // from class: G2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f2626o.g();
            }
        };
        this.f2706a = context;
        this.f2713h = ViewConfiguration.get(context).getScaledTouchSlop();
        C2.v.x().b();
        this.f2716k = C2.v.x().a();
        this.f2707b = C2.v.w().a();
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u7 = u(arrayList, "None", true);
        final int u8 = u(arrayList, "Shake", true);
        final int u9 = u(arrayList, "Flick", true);
        int ordinal = this.f2707b.b().ordinal();
        final int i8 = ordinal != 1 ? ordinal != 2 ? u7 : u9 : u8;
        C2.v.t();
        AlertDialog.Builder l8 = D0.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i8);
        l8.setTitle("Setup gesture");
        l8.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i8, new DialogInterface.OnClickListener() { // from class: G2.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                atomicInteger.set(i9);
            }
        });
        l8.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: G2.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f2661o.r();
            }
        });
        l8.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: G2.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f2662o.h(atomicInteger, i8, u8, u9, dialogInterface, i9);
            }
        });
        l8.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: G2.r
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f2667o.r();
            }
        });
        l8.create().show();
    }

    private final boolean t(float f8, float f9, float f10, float f11) {
        return Math.abs(this.f2714i.x - f8) < ((float) this.f2713h) && Math.abs(this.f2714i.y - f9) < ((float) this.f2713h) && Math.abs(this.f2715j.x - f10) < ((float) this.f2713h) && Math.abs(this.f2715j.y - f11) < ((float) this.f2713h);
    }

    private static final int u(List list, String str, boolean z7) {
        if (!z7) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.f2706a);
    }

    final /* synthetic */ void b(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        if (C2.v.w().j(this.f2706a, this.f2709d, this.f2710e)) {
            interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: G2.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2637o.c();
                }
            });
        } else {
            C2.v.w().d(this.f2706a, this.f2709d, this.f2710e);
        }
    }

    final /* synthetic */ void c() {
        s(this.f2706a);
    }

    final /* synthetic */ void d() {
        C2.v.w().c(this.f2706a);
    }

    final /* synthetic */ void e(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        if (C2.v.w().j(this.f2706a, this.f2709d, this.f2710e)) {
            interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: G2.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2635o.f();
                }
            });
        } else {
            C2.v.w().d(this.f2706a, this.f2709d, this.f2710e);
        }
    }

    final /* synthetic */ void f() {
        C2.v.w().c(this.f2706a);
    }

    final /* synthetic */ void g() {
        this.f2712g = 4;
        r();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i8, int i9, int i10, DialogInterface dialogInterface, int i11) {
        if (atomicInteger.get() != i8) {
            if (atomicInteger.get() == i9) {
                this.f2707b.n(EnumC3054jP.SHAKE);
            } else if (atomicInteger.get() == i10) {
                this.f2707b.n(EnumC3054jP.FLICK);
            } else {
                this.f2707b.n(EnumC3054jP.NONE);
            }
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i8) {
        C2.v.t();
        D0.t(this.f2706a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i8, int i9, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (i13 != i8) {
            if (i13 == i9) {
                H2.p.b("Debug mode [Creative Preview] selected.");
                AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: G2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2627o.l();
                    }
                });
                return;
            }
            if (i13 == i10) {
                H2.p.b("Debug mode [Troubleshooting] selected.");
                AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: G2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2675o.k();
                    }
                });
                return;
            }
            if (i13 == i11) {
                C3490nP c3490nP = this.f2707b;
                final InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16649f;
                InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk02 = AbstractC1497Kq.f16644a;
                if (c3490nP.r()) {
                    interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: G2.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2668o.d();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC3522nk02.execute(new Runnable() { // from class: G2.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2670o.e(interfaceExecutorServiceC3522nk0);
                        }
                    });
                    return;
                }
            }
            if (i13 == i12) {
                C3490nP c3490nP2 = this.f2707b;
                final InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk03 = AbstractC1497Kq.f16649f;
                InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk04 = AbstractC1497Kq.f16644a;
                if (c3490nP2.r()) {
                    interfaceExecutorServiceC3522nk03.execute(new Runnable() { // from class: G2.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2624o.a();
                        }
                    });
                    return;
                } else {
                    interfaceExecutorServiceC3522nk04.execute(new Runnable() { // from class: G2.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2643o.b(interfaceExecutorServiceC3522nk03);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f2706a instanceof Activity)) {
            H2.p.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f2708c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            C2.v.t();
            Map p8 = D0.p(build);
            for (String str3 : p8.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) p8.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        C2.v.t();
        AlertDialog.Builder l8 = D0.l(this.f2706a);
        l8.setMessage(str2);
        l8.setTitle("Ad Information");
        l8.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: G2.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
                this.f2629o.i(str2, dialogInterface2, i14);
            }
        });
        l8.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: G2.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i14) {
            }
        });
        l8.create().show();
    }

    final /* synthetic */ void k() {
        C0624z w7 = C2.v.w();
        String str = this.f2709d;
        String str2 = this.f2710e;
        String str3 = this.f2711f;
        boolean m8 = w7.m();
        Context context = this.f2706a;
        w7.h(w7.j(context, str, str2));
        if (!w7.m()) {
            w7.d(context, str, str2);
            return;
        }
        if (!m8 && !TextUtils.isEmpty(str3)) {
            w7.e(context, str2, str3, str);
        }
        H2.p.b("Device is linked for debug signals.");
        w7.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        C0624z w7 = C2.v.w();
        Context context = this.f2706a;
        String str = this.f2709d;
        String str2 = this.f2710e;
        if (!w7.k(context, str, str2)) {
            w7.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(w7.f2738f)) {
            H2.p.b("Creative is not pushed for this device.");
            w7.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(w7.f2738f)) {
            H2.p.b("The app is not linked for creative preview.");
            w7.d(context, str, str2);
        } else if ("0".equals(w7.f2738f)) {
            H2.p.b("Device is linked for in app preview.");
            w7.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f2712g = 0;
            this.f2714i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i8 = this.f2712g;
        if (i8 == -1) {
            return;
        }
        if (i8 == 0) {
            if (actionMasked == 5) {
                this.f2712g = 5;
                this.f2715j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f2716k.postDelayed(this.f2717l, ((Long) D2.A.c().a(AbstractC3184kf.f23707J4)).longValue());
                return;
            }
            return;
        }
        if (i8 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z7 = false;
                for (int i9 = 0; i9 < historySize; i9++) {
                    z7 |= !t(motionEvent.getHistoricalX(0, i9), motionEvent.getHistoricalY(0, i9), motionEvent.getHistoricalX(1, i9), motionEvent.getHistoricalY(1, i9));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z7) {
                    return;
                }
            }
            this.f2712g = -1;
            this.f2716k.removeCallbacks(this.f2717l);
        }
    }

    public final void n(String str) {
        this.f2709d = str;
    }

    public final void o(String str) {
        this.f2710e = str;
    }

    public final void p(String str) {
        this.f2708c = str;
    }

    public final void q(String str) {
        this.f2711f = str;
    }

    public final void r() {
        try {
            if (!(this.f2706a instanceof Activity)) {
                H2.p.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C2.v.w().b())) {
                str = "Creative preview";
            }
            String str2 = true != C2.v.w().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u7 = u(arrayList, "Ad information", true);
            final int u8 = u(arrayList, str, true);
            final int u9 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue();
            final int u10 = u(arrayList, "Open ad inspector", booleanValue);
            final int u11 = u(arrayList, "Ad inspector settings", booleanValue);
            C2.v.t();
            AlertDialog.Builder l8 = D0.l(this.f2706a);
            l8.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: G2.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f2648o.j(u7, u8, u9, u10, u11, dialogInterface, i8);
                }
            });
            l8.create().show();
        } catch (WindowManager.BadTokenException e8) {
            AbstractC0608p0.l("", e8);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2708c);
        sb.append(",DebugSignal: ");
        sb.append(this.f2711f);
        sb.append(",AFMA Version: ");
        sb.append(this.f2710e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f2709d);
        sb.append("}");
        return sb.toString();
    }

    public C0618v(Context context, String str) {
        this(context);
        this.f2708c = str;
    }
}
