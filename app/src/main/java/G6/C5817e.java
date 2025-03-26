package g6;

import d6.InterfaceC5732b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5817e extends AtomicReference implements InterfaceC5732b {
    public C5817e() {
    }

    public boolean a() {
        return EnumC5814b.f((InterfaceC5732b) get());
    }

    public boolean b(InterfaceC5732b interfaceC5732b) {
        return EnumC5814b.g(this, interfaceC5732b);
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        EnumC5814b.a(this);
    }

    public C5817e(InterfaceC5732b interfaceC5732b) {
        lazySet(interfaceC5732b);
    }
}
