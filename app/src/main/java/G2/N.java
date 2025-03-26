package G2;

import com.google.android.gms.internal.ads.AbstractC3459n7;
import com.google.android.gms.internal.ads.C1811Tq;
import com.google.android.gms.internal.ads.R6;
import com.google.android.gms.internal.ads.U6;
import com.google.android.gms.internal.ads.Y6;
import java.util.Map;

/* loaded from: classes.dex */
public final class N extends U6 {

    /* renamed from: D, reason: collision with root package name */
    private final C1811Tq f2597D;

    /* renamed from: E, reason: collision with root package name */
    private final H2.m f2598E;

    public N(String str, Map map, C1811Tq c1811Tq) {
        super(0, str, new M(c1811Tq));
        this.f2597D = c1811Tq;
        H2.m mVar = new H2.m(null);
        this.f2598E = mVar;
        mVar.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.U6
    protected final Y6 k(R6 r62) {
        return Y6.b(r62, AbstractC3459n7.b(r62));
    }

    @Override // com.google.android.gms.internal.ads.U6
    protected final /* bridge */ /* synthetic */ void t(Object obj) {
        R6 r62 = (R6) obj;
        this.f2598E.f(r62.f18606c, r62.f18604a);
        byte[] bArr = r62.f18605b;
        if (H2.m.k() && bArr != null) {
            this.f2598E.h(bArr);
        }
        this.f2597D.c(r62);
    }
}
