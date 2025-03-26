package h2;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5827a extends AbstractC5830d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f36205a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f36206b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC5832f f36207c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5833g f36208d;

    C5827a(Integer num, Object obj, EnumC5832f enumC5832f, AbstractC5833g abstractC5833g, AbstractC5831e abstractC5831e) {
        this.f36205a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f36206b = obj;
        if (enumC5832f == null) {
            throw new NullPointerException("Null priority");
        }
        this.f36207c = enumC5832f;
        this.f36208d = abstractC5833g;
    }

    @Override // h2.AbstractC5830d
    public Integer a() {
        return this.f36205a;
    }

    @Override // h2.AbstractC5830d
    public AbstractC5831e b() {
        return null;
    }

    @Override // h2.AbstractC5830d
    public Object c() {
        return this.f36206b;
    }

    @Override // h2.AbstractC5830d
    public EnumC5832f d() {
        return this.f36207c;
    }

    @Override // h2.AbstractC5830d
    public AbstractC5833g e() {
        return this.f36208d;
    }

    public boolean equals(Object obj) {
        AbstractC5833g abstractC5833g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5830d)) {
            return false;
        }
        AbstractC5830d abstractC5830d = (AbstractC5830d) obj;
        Integer num = this.f36205a;
        if (num != null ? num.equals(abstractC5830d.a()) : abstractC5830d.a() == null) {
            if (this.f36206b.equals(abstractC5830d.c()) && this.f36207c.equals(abstractC5830d.d()) && ((abstractC5833g = this.f36208d) != null ? abstractC5833g.equals(abstractC5830d.e()) : abstractC5830d.e() == null)) {
                abstractC5830d.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f36205a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f36206b.hashCode()) * 1000003) ^ this.f36207c.hashCode()) * 1000003;
        AbstractC5833g abstractC5833g = this.f36208d;
        return (hashCode ^ (abstractC5833g != null ? abstractC5833g.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f36205a + ", payload=" + this.f36206b + ", priority=" + this.f36207c + ", productData=" + this.f36208d + ", eventContext=" + ((Object) null) + "}";
    }
}
