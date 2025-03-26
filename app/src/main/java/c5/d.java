package C5;

import I5.C0628b;
import I5.InterfaceC0629c;
import J6.r;
import S6.h;

/* loaded from: classes2.dex */
public final class d implements InterfaceC0629c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1118a = new d();

    private d() {
    }

    @Override // I5.InterfaceC0629c
    public boolean a(C0628b c0628b) {
        r.e(c0628b, "contentType");
        if (c0628b.g(C0628b.a.f3225a.a())) {
            return true;
        }
        String abstractC0635i = c0628b.i().toString();
        return h.B(abstractC0635i, "application/", false, 2, null) && h.r(abstractC0635i, "+json", false, 2, null);
    }
}
