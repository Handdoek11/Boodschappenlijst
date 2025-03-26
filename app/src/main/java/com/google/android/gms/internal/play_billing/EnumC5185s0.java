package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC5185s0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* renamed from: H, reason: collision with root package name */
    private static final AbstractC5132j0 f29996H;

    /* renamed from: o, reason: collision with root package name */
    private final int f30006o;

    static {
        C5126i0 c5126i0 = new C5126i0();
        for (EnumC5185s0 enumC5185s0 : values()) {
            c5126i0.a(Integer.valueOf(enumC5185s0.f30006o), enumC5185s0);
        }
        f29996H = c5126i0.b();
    }

    EnumC5185s0(int i8) {
        this.f30006o = i8;
    }

    static EnumC5185s0 a(int i8) {
        AbstractC5132j0 abstractC5132j0 = f29996H;
        Integer valueOf = Integer.valueOf(i8);
        return !abstractC5132j0.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC5185s0) abstractC5132j0.get(valueOf);
    }
}
