package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.we0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4490we0 extends AbstractC2208bf0 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f27513a;

    /* renamed from: b, reason: collision with root package name */
    private String f27514b;

    /* renamed from: c, reason: collision with root package name */
    private int f27515c;

    /* renamed from: d, reason: collision with root package name */
    private float f27516d;

    /* renamed from: e, reason: collision with root package name */
    private int f27517e;

    /* renamed from: f, reason: collision with root package name */
    private String f27518f;

    /* renamed from: g, reason: collision with root package name */
    private byte f27519g;

    C4490we0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 a(String str) {
        this.f27518f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 b(String str) {
        this.f27514b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 c(int i8) {
        this.f27519g = (byte) (this.f27519g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 d(int i8) {
        this.f27515c = i8;
        this.f27519g = (byte) (this.f27519g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 e(float f8) {
        this.f27516d = f8;
        this.f27519g = (byte) (this.f27519g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 f(int i8) {
        this.f27519g = (byte) (this.f27519g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f27513a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2208bf0 h(int i8) {
        this.f27517e = i8;
        this.f27519g = (byte) (this.f27519g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2208bf0
    public final AbstractC2316cf0 i() {
        IBinder iBinder;
        if (this.f27519g == 31 && (iBinder = this.f27513a) != null) {
            return new C4708ye0(iBinder, this.f27514b, this.f27515c, this.f27516d, 0, 0, null, this.f27517e, null, this.f27518f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f27513a == null) {
            sb.append(" windowToken");
        }
        if ((this.f27519g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f27519g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f27519g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f27519g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f27519g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
