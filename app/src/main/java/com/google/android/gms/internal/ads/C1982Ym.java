package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1982Ym extends C2548en {

    /* renamed from: c, reason: collision with root package name */
    private String f20312c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20313d;

    /* renamed from: e, reason: collision with root package name */
    private int f20314e;

    /* renamed from: f, reason: collision with root package name */
    private int f20315f;

    /* renamed from: g, reason: collision with root package name */
    private int f20316g;

    /* renamed from: h, reason: collision with root package name */
    private int f20317h;

    /* renamed from: i, reason: collision with root package name */
    private int f20318i;

    /* renamed from: j, reason: collision with root package name */
    private int f20319j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f20320k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC4410vt f20321l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f20322m;

    /* renamed from: n, reason: collision with root package name */
    private C3976ru f20323n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f20324o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f20325p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC2657fn f20326q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f20327r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f20328s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f20329t;

    static {
        f3.f.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public C1982Ym(InterfaceC4410vt interfaceC4410vt, InterfaceC2657fn interfaceC2657fn) {
        super(interfaceC4410vt, "resize");
        this.f20312c = "top-right";
        this.f20313d = true;
        this.f20314e = 0;
        this.f20315f = 0;
        this.f20316g = -1;
        this.f20317h = 0;
        this.f20318i = 0;
        this.f20319j = -1;
        this.f20320k = new Object();
        this.f20321l = interfaceC4410vt;
        this.f20322m = interfaceC4410vt.f();
        this.f20326q = interfaceC2657fn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(boolean z7) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Ja)).booleanValue()) {
            this.f20328s.removeView((View) this.f20321l);
            this.f20327r.dismiss();
        } else {
            this.f20327r.dismiss();
            this.f20328s.removeView((View) this.f20321l);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Ka)).booleanValue()) {
            ViewParent parent = ((View) this.f20321l).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f20321l);
            }
        }
        ViewGroup viewGroup = this.f20329t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f20324o);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.La)).booleanValue()) {
                try {
                    this.f20329t.addView((View) this.f20321l);
                    this.f20321l.i1(this.f20323n);
                } catch (IllegalStateException e8) {
                    H2.p.e("Unable to add webview back to view hierarchy.", e8);
                }
            } else {
                this.f20329t.addView((View) this.f20321l);
                this.f20321l.i1(this.f20323n);
            }
        }
        if (z7) {
            g("default");
            InterfaceC2657fn interfaceC2657fn = this.f20326q;
            if (interfaceC2657fn != null) {
                interfaceC2657fn.zzb();
            }
        }
        this.f20327r = null;
        this.f20328s = null;
        this.f20329t = null;
        this.f20325p = null;
    }

    public final void h(final boolean z7) {
        synchronized (this.f20320k) {
            try {
                if (this.f20327r != null) {
                    if (!((Boolean) D2.A.c().a(AbstractC3184kf.Ia)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        j(z7);
                    } else {
                        AbstractC1497Kq.f16649f.k(new Runnable() { // from class: com.google.android.gms.internal.ads.Wm
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f19840o.j(z7);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0260 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:63:0x0138, B:129:0x0260, B:130:0x0265, B:132:0x0267, B:134:0x0287, B:136:0x028b, B:138:0x0298, B:140:0x02d4, B:172:0x038d, B:179:0x03bc, B:180:0x03d4, B:181:0x03f5, B:183:0x03fd, B:184:0x0404, B:185:0x042a, B:188:0x042d, B:190:0x0452, B:191:0x0467, B:173:0x0394, B:174:0x039b, B:175:0x03a2, B:176:0x03a9, B:177:0x03af, B:178:0x03b6, B:139:0x02d1, B:193:0x0469, B:194:0x046e, B:65:0x0140, B:67:0x0144, B:95:0x0197, B:96:0x01a1, B:105:0x01f4, B:107:0x01f7, B:109:0x01fb, B:112:0x0202, B:97:0x01a5, B:98:0x01af, B:99:0x01b6, B:100:0x01c2, B:101:0x01ca, B:102:0x01de, B:103:0x01ea, B:113:0x0211, B:119:0x023b, B:125:0x024b, B:122:0x0241, B:124:0x0249, B:116:0x0233, B:118:0x0239, B:126:0x0250, B:127:0x0257, B:196:0x0470, B:197:0x0475, B:199:0x0477, B:200:0x047c), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0267 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:63:0x0138, B:129:0x0260, B:130:0x0265, B:132:0x0267, B:134:0x0287, B:136:0x028b, B:138:0x0298, B:140:0x02d4, B:172:0x038d, B:179:0x03bc, B:180:0x03d4, B:181:0x03f5, B:183:0x03fd, B:184:0x0404, B:185:0x042a, B:188:0x042d, B:190:0x0452, B:191:0x0467, B:173:0x0394, B:174:0x039b, B:175:0x03a2, B:176:0x03a9, B:177:0x03af, B:178:0x03b6, B:139:0x02d1, B:193:0x0469, B:194:0x046e, B:65:0x0140, B:67:0x0144, B:95:0x0197, B:96:0x01a1, B:105:0x01f4, B:107:0x01f7, B:109:0x01fb, B:112:0x0202, B:97:0x01a5, B:98:0x01af, B:99:0x01b6, B:100:0x01c2, B:101:0x01ca, B:102:0x01de, B:103:0x01ea, B:113:0x0211, B:119:0x023b, B:125:0x024b, B:122:0x0241, B:124:0x0249, B:116:0x0233, B:118:0x0239, B:126:0x0250, B:127:0x0257, B:196:0x0470, B:197:0x0475, B:199:0x0477, B:200:0x047c), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1982Ym.i(java.util.Map):void");
    }

    public final void k(int i8, int i9, boolean z7) {
        synchronized (this.f20320k) {
            this.f20314e = i8;
            this.f20315f = i9;
        }
    }

    public final void l(int i8, int i9) {
        this.f20314e = i8;
        this.f20315f = i9;
    }

    public final boolean m() {
        boolean z7;
        synchronized (this.f20320k) {
            z7 = this.f20327r != null;
        }
        return z7;
    }
}
