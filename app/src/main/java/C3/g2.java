package C3;

import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

/* loaded from: classes2.dex */
public final class g2 extends AbstractBinderC0409a1 {

    /* renamed from: o, reason: collision with root package name */
    private C1092d f962o;

    /* renamed from: s, reason: collision with root package name */
    private C1092d f963s;

    /* renamed from: t, reason: collision with root package name */
    private C1092d f964t;

    /* renamed from: u, reason: collision with root package name */
    private C1092d f965u;

    /* renamed from: v, reason: collision with root package name */
    private C1092d f966v;

    /* renamed from: w, reason: collision with root package name */
    private final IntentFilter[] f967w;

    /* renamed from: x, reason: collision with root package name */
    private final String f968x;

    private g2(IntentFilter[] intentFilterArr, String str) {
        this.f967w = (IntentFilter[]) Z2.r.l(intentFilterArr);
        this.f968x = str;
    }

    public static g2 D0(C1092d c1092d, IntentFilter[] intentFilterArr) {
        g2 g2Var = new g2(intentFilterArr, null);
        g2Var.f966v = (C1092d) Z2.r.l(c1092d);
        return g2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I3(W0 w02, boolean z7, byte[] bArr) {
        try {
            w02.p2(z7, bArr);
        } catch (RemoteException e8) {
            Log.e("WearableListenerStub", "Failed to send a response back", e8);
        }
    }

    private static void r3(C1092d c1092d) {
        if (c1092d != null) {
            c1092d.a();
        }
    }

    public final IntentFilter[] J0() {
        return this.f967w;
    }

    @Override // C3.InterfaceC0412b1
    public final void R0(C0434j c0434j) {
        C1092d c1092d = this.f966v;
        if (c1092d != null) {
            c1092d.c(new a2(c0434j));
        }
    }

    @Override // C3.InterfaceC0412b1
    public final void h4(C0452p c0452p) {
        C1092d c1092d = this.f965u;
        if (c1092d != null) {
            c1092d.c(new f2(c0452p));
        }
    }

    @Override // C3.InterfaceC0412b1
    public final void k5(C0451o1 c0451o1) {
        c0451o1.f1019s.close();
    }

    @Override // C3.InterfaceC0412b1
    public final void n6(C0436j1 c0436j1, W0 w02) {
        C1092d c1092d = this.f964t;
        if (c1092d != null) {
            c1092d.c(new e2(c0436j1, w02));
        }
    }

    @Override // C3.InterfaceC0412b1
    public final void p1(C0436j1 c0436j1) {
        C1092d c1092d = this.f963s;
        if (c1092d != null) {
            c1092d.c(new c2(c0436j1));
        }
    }

    public final String s() {
        return this.f968x;
    }

    public final void t() {
        r3(this.f962o);
        this.f962o = null;
        r3(this.f963s);
        this.f963s = null;
        r3(this.f964t);
        this.f964t = null;
        r3(this.f965u);
        this.f965u = null;
        r3(this.f966v);
        this.f966v = null;
    }

    @Override // C3.InterfaceC0412b1
    public final void z5(DataHolder dataHolder) {
        C1092d c1092d = this.f962o;
        if (c1092d != null) {
            c1092d.c(new b2(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    @Override // C3.InterfaceC0412b1
    public final void G5(k2 k2Var) {
    }

    @Override // C3.InterfaceC0412b1
    public final void M1(W1 w12) {
    }

    @Override // C3.InterfaceC0412b1
    public final void O0(C0454p1 c0454p1) {
    }

    @Override // C3.InterfaceC0412b1
    public final void W6(List list) {
    }

    @Override // C3.InterfaceC0412b1
    public final void x1(C0454p1 c0454p1) {
    }
}
