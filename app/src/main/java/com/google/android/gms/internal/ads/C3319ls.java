package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3319ls implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Consumer f24390a;

    public C3319ls(Consumer consumer) {
        this.f24390a = consumer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            H2.p.g("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                H2.p.g("src missing from video GMSG.");
            } else {
                this.f24390a.accept(str2);
            }
        }
    }
}
