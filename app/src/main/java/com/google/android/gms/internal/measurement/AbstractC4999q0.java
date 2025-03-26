package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4999q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC4999q0 f29508a;

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC4999q0 f29509b;

    static {
        AbstractC4991p0 b8 = new C4924h0().e("").c(false).b(EnumC5014s0.ALL_CHECKS);
        EnumC5006r0 enumC5006r0 = EnumC5006r0.READ_AND_WRITE;
        f29508a = b8.a(enumC5006r0).d();
        f29509b = new C4924h0().e("").c(false).b(EnumC5014s0.NO_CHECKS).a(enumC5006r0).d();
        new C4924h0().e("").c(false).b(EnumC5014s0.SKIP_COMPLIANCE_CHECK).a(enumC5006r0).d();
    }

    public abstract InterfaceC4915g0 a();

    public abstract InterfaceC4906f0 b();

    public abstract EnumC5014s0 c();

    public abstract EnumC5006r0 d();

    public abstract String e();

    public abstract boolean f();
}
