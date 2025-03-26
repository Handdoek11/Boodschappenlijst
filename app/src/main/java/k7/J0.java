package k7;

import j7.c;
import kotlinx.serialization.SerializationException;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class J0 implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    private final g7.b f38628a;

    /* renamed from: b, reason: collision with root package name */
    private final g7.b f38629b;

    /* renamed from: c, reason: collision with root package name */
    private final g7.b f38630c;

    /* renamed from: d, reason: collision with root package name */
    private final i7.f f38631d;

    static final class a extends J6.s implements I6.l {
        a() {
            super(1);
        }

        public final void b(i7.a aVar) {
            J6.r.e(aVar, "$this$buildClassSerialDescriptor");
            i7.a.b(aVar, "first", J0.this.f38628a.getDescriptor(), null, false, 12, null);
            i7.a.b(aVar, "second", J0.this.f38629b.getDescriptor(), null, false, 12, null);
            i7.a.b(aVar, "third", J0.this.f38630c.getDescriptor(), null, false, 12, null);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i7.a) obj);
            return C6916E.f44463a;
        }
    }

    public J0(g7.b bVar, g7.b bVar2, g7.b bVar3) {
        J6.r.e(bVar, "aSerializer");
        J6.r.e(bVar2, "bSerializer");
        J6.r.e(bVar3, "cSerializer");
        this.f38628a = bVar;
        this.f38629b = bVar2;
        this.f38630c = bVar3;
        this.f38631d = i7.i.b("kotlin.Triple", new i7.f[0], new a());
    }

    private final x6.t d(j7.c cVar) {
        Object c8 = c.a.c(cVar, getDescriptor(), 0, this.f38628a, null, 8, null);
        Object c9 = c.a.c(cVar, getDescriptor(), 1, this.f38629b, null, 8, null);
        Object c10 = c.a.c(cVar, getDescriptor(), 2, this.f38630c, null, 8, null);
        cVar.c(getDescriptor());
        return new x6.t(c8, c9, c10);
    }

    private final x6.t e(j7.c cVar) {
        Object obj = K0.f38633a;
        Object obj2 = K0.f38633a;
        Object obj3 = K0.f38633a;
        while (true) {
            int e8 = cVar.e(getDescriptor());
            if (e8 == -1) {
                cVar.c(getDescriptor());
                if (obj == K0.f38633a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj2 == K0.f38633a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj3 != K0.f38633a) {
                    return new x6.t(obj, obj2, obj3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (e8 == 0) {
                obj = c.a.c(cVar, getDescriptor(), 0, this.f38628a, null, 8, null);
            } else if (e8 == 1) {
                obj2 = c.a.c(cVar, getDescriptor(), 1, this.f38629b, null, 8, null);
            } else {
                if (e8 != 2) {
                    throw new SerializationException("Unexpected index " + e8);
                }
                obj3 = c.a.c(cVar, getDescriptor(), 2, this.f38630c, null, 8, null);
            }
        }
    }

    @Override // g7.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x6.t deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        j7.c d8 = eVar.d(getDescriptor());
        return d8.x() ? d(d8) : e(d8);
    }

    @Override // g7.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, x6.t tVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(tVar, "value");
        j7.d d8 = fVar.d(getDescriptor());
        d8.p(getDescriptor(), 0, this.f38628a, tVar.a());
        d8.p(getDescriptor(), 1, this.f38629b, tVar.b());
        d8.p(getDescriptor(), 2, this.f38630c, tVar.c());
        d8.c(getDescriptor());
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38631d;
    }
}
