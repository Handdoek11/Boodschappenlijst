package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149Ba extends AbstractCallableC2524eb {
    public C1149Ba(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c2918i8, i8, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        int i8 = 1;
        this.f21840u.d0(3);
        try {
            boolean booleanValue = ((Boolean) this.f21841v.invoke(null, this.f21837o.b())).booleanValue();
            C2918i8 c2918i8 = this.f21840u;
            if (true == booleanValue) {
                i8 = 2;
            }
            c2918i8.d0(i8);
        } catch (InvocationTargetException e8) {
            if (!(e8.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e8;
            }
        }
    }
}
