package q3;

/* loaded from: classes.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f41102a;

    /* renamed from: b, reason: collision with root package name */
    private Long f41103b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC6528m4 f41104c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f41105d;

    public final F3 a(Boolean bool) {
        this.f41105d = bool;
        return this;
    }

    public final F3 b(Long l8) {
        this.f41103b = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final F3 c(EnumC6528m4 enumC6528m4) {
        this.f41104c = enumC6528m4;
        return this;
    }

    public final F3 d(Integer num) {
        this.f41102a = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final H3 e() {
        return new H3(this, null);
    }
}
