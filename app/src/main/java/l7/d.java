package l7;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f38830a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38831b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38832c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38833d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38834e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38835f;

    /* renamed from: g, reason: collision with root package name */
    private String f38836g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38837h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f38838i;

    /* renamed from: j, reason: collision with root package name */
    private String f38839j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38840k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f38841l;

    /* renamed from: m, reason: collision with root package name */
    private n7.b f38842m;

    public d(a aVar) {
        J6.r.e(aVar, "json");
        this.f38830a = aVar.d().e();
        this.f38831b = aVar.d().f();
        this.f38832c = aVar.d().g();
        this.f38833d = aVar.d().l();
        this.f38834e = aVar.d().b();
        this.f38835f = aVar.d().h();
        this.f38836g = aVar.d().i();
        this.f38837h = aVar.d().d();
        this.f38838i = aVar.d().k();
        this.f38839j = aVar.d().c();
        this.f38840k = aVar.d().a();
        this.f38841l = aVar.d().j();
        this.f38842m = aVar.a();
    }

    public final f a() {
        if (this.f38838i && !J6.r.a(this.f38839j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if (this.f38835f) {
            if (!J6.r.a(this.f38836g, "    ")) {
                String str = this.f38836g;
                for (int i8 = 0; i8 < str.length(); i8++) {
                    char charAt = str.charAt(i8);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f38836g).toString());
                    }
                }
            }
        } else if (!J6.r.a(this.f38836g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new f(this.f38830a, this.f38832c, this.f38833d, this.f38834e, this.f38835f, this.f38831b, this.f38836g, this.f38837h, this.f38838i, this.f38839j, this.f38840k, this.f38841l);
    }

    public final n7.b b() {
        return this.f38842m;
    }

    public final void c(boolean z7) {
        this.f38840k = z7;
    }

    public final void d(boolean z7) {
        this.f38834e = z7;
    }

    public final void e(boolean z7) {
        this.f38830a = z7;
    }

    public final void f(boolean z7) {
        this.f38832c = z7;
    }

    public final void g(boolean z7) {
        this.f38833d = z7;
    }

    public final void h(boolean z7) {
        this.f38835f = z7;
    }

    public final void i(boolean z7) {
        this.f38841l = z7;
    }

    public final void j(boolean z7) {
        this.f38838i = z7;
    }
}
