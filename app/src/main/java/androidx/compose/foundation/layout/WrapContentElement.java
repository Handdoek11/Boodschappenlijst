package androidx.compose.foundation.layout;

import B.a;
import I6.p;
import J6.AbstractC0650j;
import J6.r;
import J6.s;
import Q.y;
import c0.m;
import c0.n;
import c0.o;
import c0.q;
import s.AbstractC6719b;
import s.EnumC6718a;

/* loaded from: classes.dex */
final class WrapContentElement extends y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8057g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6718a f8058b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8059c;

    /* renamed from: d, reason: collision with root package name */
    private final p f8060d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f8061e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8062f;

    public static final class a {

        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0142a extends s implements p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ a.c f8063o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0142a(a.c cVar) {
                super(2);
                this.f8063o = cVar;
            }

            public final long b(long j8, q qVar) {
                return n.a(0, this.f8063o.a(0, o.d(j8)));
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m.b(b(((o) obj).f(), (q) obj2));
            }
        }

        static final class b extends s implements p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ B.a f8064o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(B.a aVar) {
                super(2);
                this.f8064o = aVar;
            }

            public final long b(long j8, q qVar) {
                return this.f8064o.a(o.f12091a.a(), j8, qVar);
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m.b(b(((o) obj).f(), (q) obj2));
            }
        }

        static final class c extends s implements p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ a.b f8065o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a.b bVar) {
                super(2);
                this.f8065o = bVar;
            }

            public final long b(long j8, q qVar) {
                return n.a(this.f8065o.a(0, o.e(j8), qVar), 0);
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m.b(b(((o) obj).f(), (q) obj2));
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final WrapContentElement a(a.c cVar, boolean z7) {
            return new WrapContentElement(EnumC6718a.Vertical, z7, new C0142a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(B.a aVar, boolean z7) {
            return new WrapContentElement(EnumC6718a.Both, z7, new b(aVar), aVar, "wrapContentSize");
        }

        public final WrapContentElement c(a.b bVar, boolean z7) {
            return new WrapContentElement(EnumC6718a.Horizontal, z7, new c(bVar), bVar, "wrapContentWidth");
        }

        private a() {
        }
    }

    public WrapContentElement(EnumC6718a enumC6718a, boolean z7, p pVar, Object obj, String str) {
        this.f8058b = enumC6718a;
        this.f8059c = z7;
        this.f8060d = pVar;
        this.f8061e = obj;
        this.f8062f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f8058b == wrapContentElement.f8058b && this.f8059c == wrapContentElement.f8059c && r.a(this.f8061e, wrapContentElement.f8061e);
    }

    public int hashCode() {
        return (((this.f8058b.hashCode() * 31) + AbstractC6719b.a(this.f8059c)) * 31) + this.f8061e.hashCode();
    }
}
