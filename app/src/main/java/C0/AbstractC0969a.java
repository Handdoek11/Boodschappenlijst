package c0;

import android.content.Context;
import d0.C5696b;
import d0.InterfaceC5695a;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0969a {
    public static final InterfaceC0973e a(Context context) {
        InterfaceC5695a b8;
        float f8 = context.getResources().getConfiguration().fontScale;
        if (l.a() || (b8 = C5696b.f35191a.b(f8)) == null) {
            b8 = new r(f8);
        }
        return new h(context.getResources().getDisplayMetrics().density, f8, b8);
    }
}
