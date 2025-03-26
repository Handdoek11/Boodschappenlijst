package N5;

/* loaded from: classes2.dex */
public abstract class e {
    public static final void a(b bVar, b bVar2) {
        J6.r.e(bVar, "<this>");
        J6.r.e(bVar2, "other");
        for (a aVar : bVar2.e()) {
            J6.r.c(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.f(aVar, bVar2.d(aVar));
        }
    }
}
