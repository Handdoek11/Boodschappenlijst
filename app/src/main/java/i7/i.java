package i7;

import I6.l;
import J6.r;
import J6.s;
import i7.k;
import k7.z0;
import x6.C6916E;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f36733o = new a();

        a() {
            super(1);
        }

        public final void b(i7.a aVar) {
            r.e(aVar, "$this$null");
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i7.a) obj);
            return C6916E.f44463a;
        }
    }

    public static final f a(String str, e eVar) {
        r.e(str, "serialName");
        r.e(eVar, "kind");
        if (S6.h.t(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return z0.a(str, eVar);
    }

    public static final f b(String str, f[] fVarArr, l lVar) {
        r.e(str, "serialName");
        r.e(fVarArr, "typeParameters");
        r.e(lVar, "builderAction");
        if (S6.h.t(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        i7.a aVar = new i7.a(str);
        lVar.invoke(aVar);
        return new g(str, k.a.f36736a, aVar.f().size(), AbstractC6980h.M(fVarArr), aVar);
    }

    public static final f c(String str, j jVar, f[] fVarArr, l lVar) {
        r.e(str, "serialName");
        r.e(jVar, "kind");
        r.e(fVarArr, "typeParameters");
        r.e(lVar, "builder");
        if (S6.h.t(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (r.a(jVar, k.a.f36736a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        i7.a aVar = new i7.a(str);
        lVar.invoke(aVar);
        return new g(str, jVar, aVar.f().size(), AbstractC6980h.M(fVarArr), aVar);
    }

    public static /* synthetic */ f d(String str, j jVar, f[] fVarArr, l lVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            lVar = a.f36733o;
        }
        return c(str, jVar, fVarArr, lVar);
    }
}
