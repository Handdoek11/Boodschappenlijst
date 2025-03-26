package G2;

import com.google.android.gms.internal.ads.AbstractC4330v7;
import com.google.android.gms.internal.ads.W6;
import com.google.android.gms.internal.ads.X6;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
final class K extends AbstractC4330v7 {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ byte[] f2593F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Map f2594G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ H2.m f2595H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(P p8, int i8, String str, X6 x62, W6 w62, byte[] bArr, Map map, H2.m mVar) {
        super(i8, str, x62, w62);
        this.f2593F = bArr;
        this.f2594G = map;
        this.f2595H = mVar;
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final byte[] C() {
        byte[] bArr = this.f2593F;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4330v7
    protected final void E(String str) {
        this.f2595H.g(str);
        super.E(str);
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final Map q() {
        Map map = this.f2594G;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.U6
    protected final /* bridge */ /* synthetic */ void t(Object obj) {
        E((String) obj);
    }
}
