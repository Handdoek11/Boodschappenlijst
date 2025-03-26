package L5;

import J6.r;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final g7.f f3722a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3723b;

    /* renamed from: c, reason: collision with root package name */
    private final U5.a f3724c;

    /* renamed from: d, reason: collision with root package name */
    private final Charset f3725d;

    /* renamed from: e, reason: collision with root package name */
    public g7.b f3726e;

    public e(g7.f fVar, Object obj, U5.a aVar, Charset charset) {
        r.e(fVar, "format");
        r.e(aVar, "typeInfo");
        r.e(charset, "charset");
        this.f3722a = fVar;
        this.f3723b = obj;
        this.f3724c = aVar;
        this.f3725d = charset;
    }

    public abstract Charset a();

    public abstract g7.f b();

    public final g7.b c() {
        g7.b bVar = this.f3726e;
        if (bVar != null) {
            return bVar;
        }
        r.p("serializer");
        return null;
    }

    public abstract U5.a d();

    public abstract Object e();

    public final void f(g7.b bVar) {
        r.e(bVar, "<set-?>");
        this.f3726e = bVar;
    }
}
