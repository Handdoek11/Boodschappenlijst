package C3;

import B3.InterfaceC0391j;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
public final class P extends Y2.d implements Y2.f {

    /* renamed from: u, reason: collision with root package name */
    private final int f895u;

    public P(DataHolder dataHolder, int i8, int i9) {
        super(dataHolder, i8);
        this.f895u = i9;
    }

    public final InterfaceC0391j g() {
        return new W(this.f6065o, this.f6066s, this.f895u);
    }

    public final String toString() {
        return "DataEventRef{ type=" + (b("event_type") == 1 ? "changed" : b("event_type") == 2 ? "deleted" : "unknown") + ", dataitem=" + g().toString() + " }";
    }
}
