package C3;

import A3.C0377k;
import X2.InterfaceC0755c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class O1 implements InterfaceC0755c {

    /* renamed from: a, reason: collision with root package name */
    final C0377k f894a;

    O1(C0377k c0377k) {
        this.f894a = c0377k;
    }

    @Override // X2.InterfaceC0755c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status = (Status) obj;
        int B02 = status.B0();
        if (B02 == 0 || B02 == 4001) {
            this.f894a.c(null);
        } else {
            b(status);
        }
    }

    public final void b(Status status) {
        this.f894a.b(new ApiException(status));
    }
}
