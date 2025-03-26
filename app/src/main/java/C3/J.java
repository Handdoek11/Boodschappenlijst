package C3;

import B3.InterfaceC0388g;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class J implements InterfaceC0388g.c {

    /* renamed from: o, reason: collision with root package name */
    private final Status f877o;

    /* renamed from: s, reason: collision with root package name */
    private final int f878s;

    public J(Status status, int i8) {
        this.f877o = status;
        this.f878s = i8;
    }

    @Override // B3.InterfaceC0388g.c
    public final int j0() {
        return this.f878s;
    }

    @Override // W2.f
    public final Status m0() {
        return this.f877o;
    }
}
