package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5082a4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: o, reason: collision with root package name */
    private final int f29872o;

    EnumC5082a4(int i8) {
        this.f29872o = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f29872o);
    }
}
