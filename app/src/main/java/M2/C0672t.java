package M2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.InterfaceC1459Jn;
import com.google.android.gms.internal.ads.Yj0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: M2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0672t implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1459Jn f3943a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f3944b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC0675w f3945c;

    C0672t(BinderC0675w binderC0675w, InterfaceC1459Jn interfaceC1459Jn, boolean z7) {
        this.f3943a = interfaceC1459Jn;
        this.f3944b = z7;
        this.f3945c = binderC0675w;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        try {
            this.f3943a.n("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f3943a.T1(arrayList);
            if (!this.f3945c.f3966D && !this.f3944b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.f3945c.J7(uri)) {
                    this.f3945c.f3965C.d(BinderC0675w.S7(uri, this.f3945c.f3975M, "1").toString(), null, null);
                } else {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.f23954m7)).booleanValue()) {
                        this.f3945c.f3965C.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
    }
}
