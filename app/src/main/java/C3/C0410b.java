package C3;

import B3.InterfaceC0384c;
import java.util.Set;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0410b implements InterfaceC0384c {

    /* renamed from: o, reason: collision with root package name */
    private final String f937o;

    /* renamed from: s, reason: collision with root package name */
    private final Set f938s;

    public C0410b(InterfaceC0384c interfaceC0384c) {
        String name = interfaceC0384c.getName();
        Set X7 = interfaceC0384c.X();
        this.f937o = name;
        this.f938s = X7;
    }

    @Override // B3.InterfaceC0384c
    public final Set X() {
        return this.f938s;
    }

    @Override // B3.InterfaceC0384c
    public final String getName() {
        return this.f937o;
    }
}
