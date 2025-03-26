package x4;

import android.net.Uri;
import f3.h;
import y4.C6946a;
import y4.C6948c;

/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6910b {

    /* renamed from: a, reason: collision with root package name */
    private final C6948c f44448a;

    /* renamed from: b, reason: collision with root package name */
    private final C6946a f44449b;

    public C6910b(C6946a c6946a) {
        if (c6946a == null) {
            this.f44449b = null;
            this.f44448a = null;
        } else {
            if (c6946a.A0() == 0) {
                c6946a.G0(h.d().a());
            }
            this.f44449b = c6946a;
            this.f44448a = new C6948c(c6946a);
        }
    }

    public Uri a() {
        String B02;
        C6946a c6946a = this.f44449b;
        if (c6946a == null || (B02 = c6946a.B0()) == null) {
            return null;
        }
        return Uri.parse(B02);
    }
}
