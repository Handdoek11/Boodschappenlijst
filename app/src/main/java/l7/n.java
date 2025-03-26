package l7;

/* loaded from: classes2.dex */
public abstract class n {
    public static final a a(a aVar, I6.l lVar) {
        J6.r.e(aVar, "from");
        J6.r.e(lVar, "builderAction");
        d dVar = new d(aVar);
        lVar.invoke(dVar);
        return new m(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, I6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = a.f38819d;
        }
        return a(aVar, lVar);
    }
}
