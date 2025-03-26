package k7;

import x6.C6916E;
import x6.C6933o;

/* renamed from: k7.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6140m0 extends W {

    /* renamed from: c, reason: collision with root package name */
    private final i7.f f38709c;

    /* renamed from: k7.m0$a */
    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g7.b f38710o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ g7.b f38711s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g7.b bVar, g7.b bVar2) {
            super(1);
            this.f38710o = bVar;
            this.f38711s = bVar2;
        }

        public final void b(i7.a aVar) {
            J6.r.e(aVar, "$this$buildClassSerialDescriptor");
            i7.a.b(aVar, "first", this.f38710o.getDescriptor(), null, false, 12, null);
            i7.a.b(aVar, "second", this.f38711s.getDescriptor(), null, false, 12, null);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i7.a) obj);
            return C6916E.f44463a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6140m0(g7.b bVar, g7.b bVar2) {
        super(bVar, bVar2, null);
        J6.r.e(bVar, "keySerializer");
        J6.r.e(bVar2, "valueSerializer");
        this.f38709c = i7.i.b("kotlin.Pair", new i7.f[0], new a(bVar, bVar2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(C6933o c6933o) {
        J6.r.e(c6933o, "<this>");
        return c6933o.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(C6933o c6933o) {
        J6.r.e(c6933o, "<this>");
        return c6933o.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6933o c(Object obj, Object obj2) {
        return x6.u.a(obj, obj2);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38709c;
    }
}
