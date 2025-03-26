package B5;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final N5.a f501a = new N5.a("UploadProgressListenerAttributeKey");

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f502b = new N5.a("DownloadProgressListenerAttributeKey");

    public static final F5.c c(F5.c cVar, I6.q qVar) {
        J6.r.e(cVar, "<this>");
        J6.r.e(qVar, "listener");
        return D5.b.a(cVar, G5.a.a(cVar.b(), cVar.getCoroutineContext(), I5.s.b(cVar), qVar));
    }
}
