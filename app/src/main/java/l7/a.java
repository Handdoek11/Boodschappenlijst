package l7;

import J6.AbstractC0650j;
import m7.G;
import m7.J;
import m7.M;
import m7.y;

/* loaded from: classes2.dex */
public abstract class a implements g7.l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0286a f38819d = new C0286a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f38820a;

    /* renamed from: b, reason: collision with root package name */
    private final n7.b f38821b;

    /* renamed from: c, reason: collision with root package name */
    private final m7.r f38822c;

    /* renamed from: l7.a$a, reason: collision with other inner class name */
    public static final class C0286a extends a {
        public /* synthetic */ C0286a(AbstractC0650j abstractC0650j) {
            this();
        }

        private C0286a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), n7.c.a(), null);
        }
    }

    public /* synthetic */ a(f fVar, n7.b bVar, AbstractC0650j abstractC0650j) {
        this(fVar, bVar);
    }

    @Override // g7.f
    public n7.b a() {
        return this.f38821b;
    }

    @Override // g7.l
    public final String b(g7.h hVar, Object obj) {
        J6.r.e(hVar, "serializer");
        y yVar = new y();
        try {
            m7.x.a(this, yVar, hVar, obj);
            return yVar.toString();
        } finally {
            yVar.h();
        }
    }

    @Override // g7.l
    public final Object c(g7.a aVar, String str) {
        J6.r.e(aVar, "deserializer");
        J6.r.e(str, "string");
        J j8 = new J(str);
        Object w7 = new G(this, M.OBJ, j8, aVar.getDescriptor(), null).w(aVar);
        j8.w();
        return w7;
    }

    public final f d() {
        return this.f38820a;
    }

    public final m7.r e() {
        return this.f38822c;
    }

    private a(f fVar, n7.b bVar) {
        this.f38820a = fVar;
        this.f38821b = bVar;
        this.f38822c = new m7.r();
    }
}
