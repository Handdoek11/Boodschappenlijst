package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ya0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962Ya0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3177kb0 f20282a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3177kb0 f20283b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20284c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC2308cb0 f20285d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC2634fb0 f20286e;

    private C1962Ya0(EnumC2308cb0 enumC2308cb0, EnumC2634fb0 enumC2634fb0, EnumC3177kb0 enumC3177kb0, EnumC3177kb0 enumC3177kb02, boolean z7) {
        this.f20285d = enumC2308cb0;
        this.f20286e = enumC2634fb0;
        this.f20282a = enumC3177kb0;
        if (enumC3177kb02 == null) {
            this.f20283b = EnumC3177kb0.NONE;
        } else {
            this.f20283b = enumC3177kb02;
        }
        this.f20284c = z7;
    }

    public static C1962Ya0 a(EnumC2308cb0 enumC2308cb0, EnumC2634fb0 enumC2634fb0, EnumC3177kb0 enumC3177kb0, EnumC3177kb0 enumC3177kb02, boolean z7) {
        AbstractC1789Tb0.c(enumC2308cb0, "CreativeType is null");
        AbstractC1789Tb0.c(enumC2634fb0, "ImpressionType is null");
        AbstractC1789Tb0.c(enumC3177kb0, "Impression owner is null");
        if (enumC3177kb0 == EnumC3177kb0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC2308cb0 == EnumC2308cb0.DEFINED_BY_JAVASCRIPT && enumC3177kb0 == EnumC3177kb0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC2634fb0 == EnumC2634fb0.DEFINED_BY_JAVASCRIPT && enumC3177kb0 == EnumC3177kb0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C1962Ya0(enumC2308cb0, enumC2634fb0, enumC3177kb0, enumC3177kb02, z7);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        AbstractC1649Pb0.e(jSONObject, "impressionOwner", this.f20282a);
        AbstractC1649Pb0.e(jSONObject, "mediaEventsOwner", this.f20283b);
        AbstractC1649Pb0.e(jSONObject, "creativeType", this.f20285d);
        AbstractC1649Pb0.e(jSONObject, "impressionType", this.f20286e);
        AbstractC1649Pb0.e(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f20284c));
        return jSONObject;
    }
}
