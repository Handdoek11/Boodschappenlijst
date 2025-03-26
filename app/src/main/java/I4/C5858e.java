package i4;

import android.os.Bundle;
import e4.InterfaceC5746a;
import java.util.Locale;
import k4.InterfaceC6102b;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5858e implements InterfaceC5746a.b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6102b f36517a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6102b f36518b;

    C5858e() {
    }

    private static void b(InterfaceC6102b interfaceC6102b, String str, Bundle bundle) {
        if (interfaceC6102b == null) {
            return;
        }
        interfaceC6102b.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f36517a : this.f36518b, str, bundle);
    }

    @Override // e4.InterfaceC5746a.b
    public void a(int i8, Bundle bundle) {
        String string;
        j4.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i8), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(InterfaceC6102b interfaceC6102b) {
        this.f36518b = interfaceC6102b;
    }

    public void e(InterfaceC6102b interfaceC6102b) {
        this.f36517a = interfaceC6102b;
    }
}
