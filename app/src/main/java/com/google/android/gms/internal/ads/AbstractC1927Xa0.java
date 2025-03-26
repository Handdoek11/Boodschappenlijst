package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Xa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1927Xa0 {
    public static AbstractC1927Xa0 a(C1962Ya0 c1962Ya0, C1997Za0 c1997Za0) {
        AbstractC1789Tb0.a();
        return new C2200bb0(c1962Ya0, c1997Za0, UUID.randomUUID().toString());
    }

    public abstract void b(View view, EnumC2525eb0 enumC2525eb0, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
