package g7;

import J6.K;
import J6.r;
import J6.s;
import i7.d;
import i7.j;
import java.util.List;
import k7.AbstractC6117b;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.EnumC6932n;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class d extends AbstractC6117b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.b f36101a;

    /* renamed from: b, reason: collision with root package name */
    private List f36102b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6928j f36103c;

    static final class a extends s implements I6.a {

        /* renamed from: g7.d$a$a, reason: collision with other inner class name */
        static final class C0260a extends s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f36105o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0260a(d dVar) {
                super(1);
                this.f36105o = dVar;
            }

            public final void b(i7.a aVar) {
                r.e(aVar, "$this$buildSerialDescriptor");
                i7.a.b(aVar, "type", h7.a.C(K.f3551a).getDescriptor(), null, false, 12, null);
                i7.a.b(aVar, "value", i7.i.d("kotlinx.serialization.Polymorphic<" + this.f36105o.e().a() + '>', j.a.f36734a, new i7.f[0], null, 8, null), null, false, 12, null);
                aVar.h(this.f36105o.f36102b);
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((i7.a) obj);
                return C6916E.f44463a;
            }
        }

        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i7.f invoke() {
            return i7.b.c(i7.i.c("kotlinx.serialization.Polymorphic", d.a.f36702a, new i7.f[0], new C0260a(d.this)), d.this.e());
        }
    }

    public d(Q6.b bVar) {
        r.e(bVar, "baseClass");
        this.f36101a = bVar;
        this.f36102b = AbstractC6987o.e();
        this.f36103c = AbstractC6929k.b(EnumC6932n.f44481s, new a());
    }

    @Override // k7.AbstractC6117b
    public Q6.b e() {
        return this.f36101a;
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return (i7.f) this.f36103c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
