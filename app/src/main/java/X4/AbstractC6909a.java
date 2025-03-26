package x4;

import A3.AbstractC0376j;
import android.content.Intent;
import com.google.firebase.f;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6909a {
    public static synchronized AbstractC6909a b() {
        AbstractC6909a c8;
        synchronized (AbstractC6909a.class) {
            c8 = c(f.l());
        }
        return c8;
    }

    public static synchronized AbstractC6909a c(f fVar) {
        AbstractC6909a abstractC6909a;
        synchronized (AbstractC6909a.class) {
            abstractC6909a = (AbstractC6909a) fVar.j(AbstractC6909a.class);
        }
        return abstractC6909a;
    }

    public abstract AbstractC0376j a(Intent intent);
}
