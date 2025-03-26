package y4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import Z2.r;
import a3.AbstractC0816d;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1096h;
import e4.InterfaceC5746a;
import x4.AbstractC6909a;
import x4.C6910b;
import y4.InterfaceC6953h;

/* renamed from: y4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6952g extends AbstractC6909a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.b f44586a;

    /* renamed from: b, reason: collision with root package name */
    private final H4.b f44587b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.f f44588c;

    /* renamed from: y4.g$a */
    static class a extends InterfaceC6953h.a {
        a() {
        }

        @Override // y4.InterfaceC6953h
        public void v1(Status status, C6955j c6955j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: y4.g$b */
    static class b extends a {

        /* renamed from: o, reason: collision with root package name */
        private final C0377k f44589o;

        /* renamed from: s, reason: collision with root package name */
        private final H4.b f44590s;

        public b(H4.b bVar, C0377k c0377k) {
            this.f44590s = bVar;
            this.f44589o = c0377k;
        }

        @Override // y4.InterfaceC6953h
        public void g1(Status status, C6946a c6946a) {
            Bundle bundle;
            InterfaceC5746a interfaceC5746a;
            X2.l.a(status, c6946a == null ? null : new C6910b(c6946a), this.f44589o);
            if (c6946a == null || (bundle = c6946a.D0().getBundle("scionData")) == null || bundle.keySet() == null || (interfaceC5746a = (InterfaceC5746a) this.f44590s.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                interfaceC5746a.b("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* renamed from: y4.g$c */
    static final class c extends AbstractC1096h {

        /* renamed from: d, reason: collision with root package name */
        private final String f44591d;

        /* renamed from: e, reason: collision with root package name */
        private final H4.b f44592e;

        c(H4.b bVar, String str) {
            super(null, false, 13201);
            this.f44591d = str;
            this.f44592e = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.AbstractC1096h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(C6950e c6950e, C0377k c0377k) {
            c6950e.m0(new b(this.f44592e, c0377k), this.f44591d);
        }
    }

    public C6952g(com.google.firebase.f fVar, H4.b bVar) {
        this(new C6949d(fVar.k()), fVar, bVar);
    }

    @Override // x4.AbstractC6909a
    public AbstractC0376j a(Intent intent) {
        C6910b d8;
        AbstractC0376j n8 = this.f44586a.n(new c(this.f44587b, intent != null ? intent.getDataString() : null));
        return (intent == null || (d8 = d(intent)) == null) ? n8 : AbstractC0379m.e(d8);
    }

    public C6910b d(Intent intent) {
        C6946a c6946a = (C6946a) AbstractC0816d.b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", C6946a.CREATOR);
        if (c6946a != null) {
            return new C6910b(c6946a);
        }
        return null;
    }

    public C6952g(com.google.android.gms.common.api.b bVar, com.google.firebase.f fVar, H4.b bVar2) {
        this.f44586a = bVar;
        this.f44588c = (com.google.firebase.f) r.l(fVar);
        this.f44587b = bVar2;
        if (bVar2.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
