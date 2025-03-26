package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5012r6;
import java.util.Map;

/* loaded from: classes2.dex */
final class M2 implements InterfaceC5012r6 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f30586a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I2 f30587b;

    M2(I2 i22, String str) {
        this.f30586a = str;
        this.f30587b = i22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5012r6
    public final String n(String str) {
        Map map = (Map) this.f30587b.f30536d.get(this.f30586a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
