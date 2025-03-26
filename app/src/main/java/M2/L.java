package M2;

import D2.C0555y;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.C2296cR;
import com.google.android.gms.internal.ads.C4035sQ;
import com.google.android.gms.internal.ads.C4618xo;
import com.google.android.gms.internal.ads.InterfaceC1420Ij0;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class L implements InterfaceC1420Ij0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3798a;

    /* renamed from: b, reason: collision with root package name */
    private final C4035sQ f3799b;

    public L(Executor executor, C4035sQ c4035sQ) {
        this.f3798a = executor;
        this.f3799b = c4035sQ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(Object obj) {
        final C4618xo c4618xo = (C4618xo) obj;
        return AbstractC2326ck0.n(this.f3799b.c(c4618xo), new InterfaceC1420Ij0() { // from class: M2.K
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj2) {
                C2296cR c2296cR = (C2296cR) obj2;
                N n8 = new N(new JsonReader(new InputStreamReader(c2296cR.b())), c2296cR.a());
                C4618xo c4618xo2 = c4618xo;
                try {
                    n8.f3802b = C0555y.b().m(c4618xo2.f27916o).toString();
                } catch (JSONException unused) {
                    n8.f3802b = "{}";
                }
                if (!c4618xo2.f27915E.isEmpty()) {
                    try {
                        n8.f3803c = C0555y.b().m(c4618xo2.f27915E).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return AbstractC2326ck0.h(n8);
            }
        }, this.f3798a);
    }
}
