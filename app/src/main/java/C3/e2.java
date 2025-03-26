package C3;

import A3.AbstractC0376j;
import A3.InterfaceC0371e;
import B3.InterfaceC0397p;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1092d;

/* loaded from: classes2.dex */
final class e2 implements C1092d.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0436j1 f950a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W0 f951b;

    e2(C0436j1 c0436j1, W0 w02) {
        this.f950a = c0436j1;
        this.f951b = w02;
    }

    @Override // com.google.android.gms.common.api.internal.C1092d.b
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C0436j1 c0436j1 = this.f950a;
        AbstractC0376j c8 = ((InterfaceC0397p) obj).c(c0436j1.A0(), c0436j1.i0(), c0436j1.getData());
        if (c8 == null) {
            g2.I3(this.f951b, false, null);
        } else {
            c8.c(new InterfaceC0371e() { // from class: C3.d2
                @Override // A3.InterfaceC0371e
                public final void a(AbstractC0376j abstractC0376j) {
                    e2 e2Var = this.f947a;
                    if (abstractC0376j.s()) {
                        g2.I3(e2Var.f951b, true, (byte[]) abstractC0376j.o());
                    } else {
                        Log.e("WearableListenerStub", "Failed to resolve future, sending null response", abstractC0376j.n());
                        g2.I3(e2Var.f951b, false, null);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.common.api.internal.C1092d.b
    public final void b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        g2.I3(this.f951b, false, null);
    }
}
