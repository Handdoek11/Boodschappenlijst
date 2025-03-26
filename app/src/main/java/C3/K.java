package C3;

import B3.InterfaceC0388g;
import Z2.AbstractC0764c;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class K implements InterfaceC0388g {
    @Override // B3.InterfaceC0388g
    public final W2.d a(com.google.android.gms.common.api.c cVar, Uri uri, int i8) {
        AbstractC0764c.a(uri, "uri must not be null");
        boolean z7 = true;
        if (i8 != 0) {
            if (i8 == 1) {
                i8 = 1;
            } else {
                z7 = false;
            }
        }
        Z2.r.b(z7, "invalid filter type");
        return cVar.a(new G(this, cVar, uri, i8));
    }

    public final W2.d b(com.google.android.gms.common.api.c cVar, Uri uri, int i8) {
        AbstractC0764c.a(uri, "uri must not be null");
        boolean z7 = true;
        if (i8 != 0) {
            if (i8 == 1) {
                i8 = 1;
            } else {
                z7 = false;
            }
        }
        Z2.r.b(z7, "invalid filter type");
        return cVar.a(new H(this, cVar, uri, i8));
    }
}
