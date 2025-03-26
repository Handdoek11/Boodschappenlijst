package L5;

import I5.C0628b;
import J6.r;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: f, reason: collision with root package name */
    private final g7.f f3717f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f3718g;

    /* renamed from: h, reason: collision with root package name */
    private final U5.a f3719h;

    /* renamed from: i, reason: collision with root package name */
    private final Charset f3720i;

    /* renamed from: j, reason: collision with root package name */
    private final C0628b f3721j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g7.f fVar, Object obj, U5.a aVar, Charset charset, C0628b c0628b) {
        super(fVar, obj, aVar, charset);
        r.e(fVar, "format");
        r.e(aVar, "typeInfo");
        r.e(charset, "charset");
        r.e(c0628b, "contentType");
        this.f3717f = fVar;
        this.f3718g = obj;
        this.f3719h = aVar;
        this.f3720i = charset;
        this.f3721j = c0628b;
    }

    @Override // L5.e
    public Charset a() {
        return this.f3720i;
    }

    @Override // L5.e
    public g7.f b() {
        return this.f3717f;
    }

    @Override // L5.e
    public U5.a d() {
        return this.f3719h;
    }

    @Override // L5.e
    public Object e() {
        return this.f3718g;
    }

    public final C0628b g() {
        return this.f3721j;
    }
}
