package G2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.X90;
import com.google.android.gms.internal.ads.Y90;

/* loaded from: classes.dex */
public final class Y extends B {

    /* renamed from: c, reason: collision with root package name */
    private final H2.u f2607c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2608d;

    /* renamed from: e, reason: collision with root package name */
    private final H2.v f2609e;

    public Y(Context context, String str, String str2, Y90 y90, H2.v vVar) {
        this.f2607c = new H2.u(C2.v.t().H(context, str));
        this.f2608d = str2;
        this.f2609e = vVar;
    }

    @Override // G2.B
    public final void a() {
        H2.v vVar = this.f2609e;
        if (vVar == null) {
            this.f2607c.n(this.f2608d);
        } else {
            new X90(vVar.b(), this.f2607c, AbstractC1497Kq.f16648e, null).d(this.f2608d);
        }
    }
}
