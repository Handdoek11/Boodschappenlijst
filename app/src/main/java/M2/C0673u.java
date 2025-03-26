package M2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.InterfaceC1459Jn;
import com.google.android.gms.internal.ads.Yj0;
import java.util.List;

/* renamed from: M2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0673u implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1459Jn f3950a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f3951b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC0675w f3952c;

    C0673u(BinderC0675w binderC0675w, InterfaceC1459Jn interfaceC1459Jn, boolean z7) {
        this.f3950a = interfaceC1459Jn;
        this.f3951b = z7;
        this.f3952c = binderC0675w;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        try {
            this.f3950a.n("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List<Uri> list = (List) obj;
        try {
            BinderC0675w.B7(this.f3952c, list);
            this.f3950a.T1(list);
            if (!this.f3952c.f3967E && !this.f3951b) {
                return;
            }
            for (Uri uri : list) {
                if (this.f3952c.I7(uri)) {
                    this.f3952c.f3965C.d(BinderC0675w.S7(uri, this.f3952c.f3975M, "1").toString(), null, null);
                } else {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23954m7)).booleanValue()) {
                        this.f3952c.f3965C.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
