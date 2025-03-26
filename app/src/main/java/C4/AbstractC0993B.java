package c4;

/* renamed from: c4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0993B {
    static boolean a(InterfaceC0992A interfaceC0992A, Object obj) {
        if (obj == interfaceC0992A) {
            return true;
        }
        if (obj instanceof InterfaceC0992A) {
            return interfaceC0992A.a().equals(((InterfaceC0992A) obj).a());
        }
        return false;
    }
}
