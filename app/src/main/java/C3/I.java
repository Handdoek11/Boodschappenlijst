package C3;

import B3.InterfaceC0388g;
import B3.InterfaceC0391j;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class I implements InterfaceC0388g.a {

    /* renamed from: o, reason: collision with root package name */
    private final Status f875o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC0391j f876s;

    public I(Status status, InterfaceC0391j interfaceC0391j) {
        this.f875o = status;
        this.f876s = interfaceC0391j;
    }

    @Override // B3.InterfaceC0388g.a
    public final InterfaceC0391j N() {
        return this.f876s;
    }

    @Override // W2.f
    public final Status m0() {
        return this.f875o;
    }
}
