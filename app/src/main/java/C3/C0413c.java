package C3;

import B3.InterfaceC0382a;
import B3.InterfaceC0384c;
import com.google.android.gms.common.api.Status;

/* renamed from: C3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0413c implements InterfaceC0382a.b {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC0384c f942o;

    /* renamed from: s, reason: collision with root package name */
    private final Status f943s;

    public C0413c(Status status, InterfaceC0384c interfaceC0384c) {
        this.f943s = status;
        this.f942o = interfaceC0384c;
    }

    @Override // B3.InterfaceC0382a.b
    public final InterfaceC0384c b0() {
        return this.f942o;
    }

    @Override // W2.f
    public final Status m0() {
        return this.f943s;
    }
}
