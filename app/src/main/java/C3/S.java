package C3;

import B3.InterfaceC0392k;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
public final class S extends Y2.d implements InterfaceC0392k {
    public S(DataHolder dataHolder, int i8) {
        super(dataHolder, i8);
    }

    @Override // B3.InterfaceC0392k
    public final String d() {
        return c("asset_id");
    }

    @Override // B3.InterfaceC0392k
    public final String e() {
        return c("asset_key");
    }

    @Override // Y2.f
    public final /* synthetic */ Object q0() {
        return new Q(this);
    }
}
