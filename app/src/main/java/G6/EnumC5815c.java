package g6;

import a6.i;
import i6.InterfaceC5876a;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5815c implements InterfaceC5876a {
    INSTANCE,
    NEVER;

    public static void a(i iVar) {
        iVar.d(INSTANCE);
        iVar.a();
    }

    public static void h(Throwable th, i iVar) {
        iVar.d(INSTANCE);
        iVar.onError(th);
    }

    @Override // i6.InterfaceC5880e
    public Object f() {
        return null;
    }

    @Override // i6.InterfaceC5880e
    public boolean g(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // i6.InterfaceC5877b
    public int i(int i8) {
        return i8 & 2;
    }

    @Override // i6.InterfaceC5880e
    public boolean isEmpty() {
        return true;
    }

    @Override // d6.InterfaceC5732b
    public void c() {
    }

    @Override // i6.InterfaceC5880e
    public void clear() {
    }
}
